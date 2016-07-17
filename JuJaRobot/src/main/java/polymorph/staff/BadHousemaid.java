package polymorph.staff;

import polymorph.apartment.Apartment;

public class BadHousemaid extends  Housemaid {

    @Override
    public void clean(Apartment apartment) {
        super.clean(apartment);
        System.out.println("Sleeping at " + apartment.getRooms().get(4));
    }
}
