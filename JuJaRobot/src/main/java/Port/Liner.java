package Port;

public class Liner extends AbstractShip{

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        return passengers * DEFAULT_RENTAL;
    }

    public float calculatePayment(float value) {
        if (value <= 0){
            return passengers * DEFAULT_RENTAL;
        } else {
            return calculatePayment();
        }
    }

    @Override
    public String toPrint() {
        return super.toPrint();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
