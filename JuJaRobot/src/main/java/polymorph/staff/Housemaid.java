package polymorph.staff;

import polymorph.Floor;
import polymorph.Room;
import polymorph.apartment.Apartment;
import polymorph.apartment.TechnicalApartment;

public class Housemaid {

    private HousemaidTools tools;
    private Floor floor;

    public Housemaid(Floor floor) {
        this.floor = floor;
    }

    public void clean(Apartment apartment) {
        if (tools == null) {
            TechnicalApartment techApartment = (TechnicalApartment)floor.getApartments()[0];
            tools = techApartment.getTools();
        }
        for (Room room: apartment.getRooms()) {
            tools.clean(room);
        }
    }
}
