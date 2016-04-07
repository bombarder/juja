package ua.com.juja.jujarobot;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        lookFor(array);

    }

    public static int[] lookFor(int[] array) {

        int[] returnArray = new int[0];
        int start = 0;
        int end = 0;
        int width = 0;
        int maxWidth = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                start = i - width;
                width++;
                end = i;

            } else {
                width = 0;
            }

            if (width >= maxWidth && width > 0){
                maxWidth = width;
                returnArray = new int[2];
                returnArray[0] = start;
                returnArray[1] = end;
            }
        }

        return returnArray;
    }
}
