package ua.com.juja.jujarobot;


public class InsertionSorter {
    public static void sort(int[] arr) {

        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = java.util.Arrays.binarySearch(arr, 0, k, newElement);
            if (location >= 0) {
                System.arraycopy(arr, location, arr, location + 1, k - location);
                arr[location + 1] = newElement;

            } else {
                location = location * (-1);
                location--;
                System.arraycopy(arr, location, arr, location + 1, k - location);
                arr[location] = newElement;
            }

        }
    }
}