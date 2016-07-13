package polymorph;

import polymorph.apartment.Apartment;
import polymorph.apartment.LivingApartment;
import polymorph.apartment.TechnicalApartment;
import polymorph.staff.Housemaid;

public class Floor {

    private static final int DEFAULT_APARTMENT_CAPACITY = 5;

    private int number;
    private Apartment[] apartments;
    private Housemaid housemaid;

    public Floor(int number, int capacity, Housemaid housemaid) {
        this.number = number;
        this.housemaid = housemaid;
        apartments = new Apartment[capacity];
        apartments[0] = new TechnicalApartment(NumberGenerator.next(), DEFAULT_APARTMENT_CAPACITY);
        for (int i = 1; i < capacity; i++) {
            apartments[i] = new LivingApartment(NumberGenerator.next(), DEFAULT_APARTMENT_CAPACITY);
        }

    }

    public String toString() {
        String result = "\tHi, I am floor #" + number + " with:\n";
        for (Apartment apartment : apartments) {
            result += apartment.toString() + "\n";
        }

        return result;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public Apartment getFreeApartment() {
        for (Apartment apartment : apartments) {
            if (apartment.isFree()) {
                housemaid.clean(apartment);
                return apartment;
            }
        }
        return null;
    }
}
