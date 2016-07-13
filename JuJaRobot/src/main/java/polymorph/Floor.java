package ua.com.juja.a7_polymorph.asd;

import ua.com.juja.a7_polymorph.asd.apartment.Apartment;
import ua.com.juja.a7_polymorph.asd.apartment.LivingApartment;
import ua.com.juja.a7_polymorph.asd.apartment.TechnicalApartment;
import ua.com.juja.a7_polymorph.asd.staff.Housemaid;

/**
 * Created by indigo on 31.07.2015.
 */
public class Floor {

    private static final int DEFAULT_APARTMENT_CAPACITY = 5;

    private int number;
    private Apartment[] apartments;
    private Housemaid housemaid;

    public Floor(int number, int capacity) {
        this.number = number;
        apartments = new Apartment[capacity];
        apartments[0] = new TechnicalApartment(NumberGenerator.next(), DEFAULT_APARTMENT_CAPACITY);
        for (int i = 1; i < capacity; i++) {
            apartments[i] = new LivingApartment(NumberGenerator.next(), DEFAULT_APARTMENT_CAPACITY);
        }
        housemaid = new Housemaid(this);
    }

    public String toString() {
        String result = "\tHi, I am floor #" + number + " with:\n";
        for (Apartment apartment : apartments) {
            result += apartment.toString() + "\n";
        }

//        for (int apartmentType : apartmentTypes) {
//            if (apartmentType == LIVING_APARTMENT) {
//                result +=  LivingApartment.toString();
//            } else if (apartmentType == QWE_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == ASD_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == sfddfsdL_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == TECHNICAL_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == TECHNICAL_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            } else if (apartmentType == TECHNICAL_APARTMENT) {
//                result +=  TechnicalApartment.toString();
//            }
//        }
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
