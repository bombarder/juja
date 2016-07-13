package polymorph;

import polymorph.apartment.LivingApartment;
import polymorph.apartment.Apartment;

public class MultiHouse {

    private static final int DEFAULT_FLOOR_CAPACITY = 4;
    private Floor[] floors;

    public MultiHouse(int countFloors) {
        floors = new Floor[countFloors];
        for (int i = 0; i < countFloors; i++) {
            floors[i] = new Floor(i + 1, DEFAULT_FLOOR_CAPACITY);
        }
    }

    public Floor get(int number) {
        return floors[number - 1];
    }

    public String toString() {
        String result = "I am a MultiHouse with:\n";
        for (Floor floor : floors) {
            result += floor.toString();
        }
        return result;
    }

    public void settle(Owner[] owners) {
        int ownerIndex = 0;

        while (true) {
            Apartment app = findFreeApartment();
            if (app.isFree() && app instanceof LivingApartment) {
                LivingApartment livingApartment = (LivingApartment)app; // TODO remove

                int capacity = livingApartment.getCapacity();
                for (int i = 0; i < capacity; i++) {
                    livingApartment.addOwner(owners[ownerIndex]);
                    ownerIndex++;
                    if (ownerIndex >= owners.length) {
                        return;
                    }
                }
            }
        }
    }

    private Apartment findFreeApartment() {
        for (Floor floor : floors) {
            Apartment app = floor.getFreeApartment();
            if (app != null) {
                return app;
            }
        }
        return null;
    }
}
