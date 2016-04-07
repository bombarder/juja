package ua.com.juja.jujarobot;

import java.util.Arrays;

public class ArrayUtilsTest1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {0, 4};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
