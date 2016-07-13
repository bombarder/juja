package ua.com.juja.a7_polymorph.asd.apartment;

import ua.com.juja.a7_polymorph.asd.staff.HousemaidTools;

public class TechnicalApartment extends Apartment {

    private HousemaidTools tools;

    public TechnicalApartment(int number, int capacity) {
        super(number, capacity);
        tools = new HousemaidTools();
    }

    public HousemaidTools getTools() {
        return tools;
    }
}
