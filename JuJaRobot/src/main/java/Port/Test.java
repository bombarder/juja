package Port;

public class Test {
    public static void main(String[] args) {
        //check print empty queue
        String expectedResultPrintShipQueueEmpty="QueueEmpty";

        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();

        String actualResultPrintShipQueueEmpty= odessaSeaPort.printQueueShip();
        if(!(actualResultPrintShipQueueEmpty.equals(expectedResultPrintShipQueueEmpty)))
            throw new AssertionError("Print empty queue expected to be printed " +
                    expectedResultPrintShipQueueEmpty + " but found " + actualResultPrintShipQueueEmpty);
        System.out.print("OK");
    }
}
