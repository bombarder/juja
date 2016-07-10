package Port;

public class OdessaSeaPort implements SeaPortQueue {

    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort < LENGTH_QUEUE_SHIP - 1){
            arrayShip[++indexShipInPort] = ship;
            return indexShipInPort;
        } else {
            return NO_SHIP_IN_ARRAY;
        }
    }

    @Override
    public int removeShipFromBeginQueue() {
        if ( indexShipInPort != NO_SHIP_IN_ARRAY){
            arrayShip[0] = arrayShip[1];
            return 1;
        } else {
            return NO_SHIP_IN_ARRAY;
        }
    }

    @Override
    public String printQueueShip() {
        if (indexShipInPort < 0){
            return "QueueEmpty";
        } else {
            return arrayShip[0].toPrint() + arrayShip[1].toPrint();
        }
    }
}
