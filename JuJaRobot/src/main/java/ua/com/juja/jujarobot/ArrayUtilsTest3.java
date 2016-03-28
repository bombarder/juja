package ua.com.juja.jujarobot;

import java.util.Arrays;

public class ArrayUtilsTest3 {
    public static void main(String[] args) {
        int[] array = {-1000};
        int[] expected = {};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError(Arrays.toString(actual));
        }

        System.out.print("OK");
    }
}
