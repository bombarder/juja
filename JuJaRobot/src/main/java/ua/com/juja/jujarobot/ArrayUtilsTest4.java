package ua.com.juja.jujarobot;

import java.util.Arrays;

public class ArrayUtilsTest4 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int[] expected = {1, 4};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
