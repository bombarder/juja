package polymorph.apartment;

public class YahooApartment extends Apartment {
    public YahooApartment(int number, int capacity) {
        super(number, capacity);
    }

    @Override
    public String toString() {
        return "Hello User!!";
    }
}
