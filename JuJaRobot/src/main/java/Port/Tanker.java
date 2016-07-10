package Port;

public class Tanker extends AbstractShip {

    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }
    public float calculatePayment(float value) {
        if (value <= 0){
            return volume * DEFAULT_RENTAL;
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
