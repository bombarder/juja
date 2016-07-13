package ua.com.juja.a7_polymorph.asd;

import ua.com.juja.a7_polymorph.asd.apartment.Apartment;

public class Room /* extends Object */{
    private Apartment apartment;
    private RoomType type;
    private Object[] objects;

    public Room(RoomType type, Apartment apartment) {
        this.apartment = apartment;
        objects = new Object[1000];
        this.type = type;
    }

    @Override
    public String toString() {
        return "room " + type + " of ap#" + apartment.getNumber();
    }
}
