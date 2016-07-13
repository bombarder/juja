package polymorph.staff;

import polymorph.Room;

public class HousemaidTools {

    public void clean(Room room) {
        System.out.println("Cleaning room " + room.toString() + " ...");
        sleep();
        System.out.println("Cleaning done!");
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

