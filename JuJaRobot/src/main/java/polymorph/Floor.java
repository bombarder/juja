package polymorph;

import polymorph.apartment.Apartment;
import polymorph.apartment.LivingApartment;
import polymorph.apartment.TechnicalApartment;
import polymorph.staff.Housemaid;

public class Floor {

    private static final int DEFAULT_APARTMENT_CAPACITY = 5;

    private int number;
    private MyArray apartments;
    private Housemaid housemaid;

    public Floor(int number, int capacity, Housemaid housemaid) {
        this.number = number;
        this.housemaid = housemaid;
        apartments = new MyArray();
        apartments.add(new TechnicalApartment(NumberGenerator.next(), DEFAULT_APARTMENT_CAPACITY));
        for (int i = 1; i < capacity; i++) {
            apartments.add(new LivingApartment(NumberGenerator.next(), DEFAULT_APARTMENT_CAPACITY));
        }
    }

    public String toString() {
        String result = "\tHi, I am floor #" + number + " with:\n";
        for (Object apartment : apartments.getArray()) {
            result += apartment.toString() + "\n";
        }

        return result;
    }

    public Object[] getApartments() {
        return apartments.getArray();
    }

    public Apartment getFreeApartment() {
        for (Object object : apartments.getArray()) {
            Apartment apartment = (Apartment)object;
            if (apartment.isFree()) {
                housemaid.clean(apartment);
                return apartment;
            }
        }
        return null;
    }
}
