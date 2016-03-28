package ua.com.juja.jujarobot;

import java.util.Arrays;

public class ArrayUtilsTest2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 0};
        int[] expected = {0, 3};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
