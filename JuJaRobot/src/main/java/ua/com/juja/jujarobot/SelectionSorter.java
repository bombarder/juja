package ua.com.juja.jujarobot;

import java.util.Arrays;

public class SelectionSorter {

    public static void sort(int[] arr) {


        for (int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            int location = i - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
            System.out.println(Arrays.toString(arr));
        }

    }
}
