package polymorph;

public class NumberGenerator {
    private static int number = 1;

    public static int next() {
        int result = number;
        number++;
        return result;
    }
}
