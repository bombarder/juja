package ua.com.juja.jujarobot;

public class IntegerUtils {
    public static void main(String[] args) {
        int number = 0b00111000_11111111_00000000_10101010;
        System.out.println(leftShift(number));
    }
    public static int leftShift(int arg) {
        int highBit = 0b10000000_00000000_00000000_00000000 & arg;
        if (highBit != 0) {
            highBit = 1;
        }
        arg = arg << 1;
        return arg + highBit;
    }
}
