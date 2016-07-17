package polymorph;

import polymorph.apartment.Apartment;

public class Room {
    private Apartment apartment;
    private RoomType type;
    private MyArray objects;

    public Room(RoomType type, Apartment apartment) {
        this.apartment = apartment;
        objects = new MyArray(1000);
        this.type = type;
    }

    @Override
    public String toString() {
        return "room " + type + " of ap#" + apartment.getNumber();
    }
}
