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
            arrayShip[0] = arrayShip[indexShipInPort - 1];
            arrayShip[indexShipInPort - 1] = arrayShip[indexShipInPort];
            indexShipInPort--;
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

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips){

        String result = "";

        if (arrayShips == null || arrayShips.length == 0){
            return "";
        } else {
            AbstractShip tmpShip;
            for (int i = 0; i < arrayShips.length - 1; i++) {
                for (int j = 1; j< arrayShips.length; j++) {
                    if (arrayShips[i].calculatePayment() > arrayShips[j].calculatePayment()) {
                        tmpShip = arrayShips[i];
                        arrayShips[i] = arrayShips[j];
                        arrayShips[j] = tmpShip;
                    }
                }
            }

            for (AbstractShip ship:arrayShips) {
                //System.out.println(ship.toString());
                result = result + ship.getName() + "=" + ship.calculatePayment();
            }
        }
        return result;
    } 
}
