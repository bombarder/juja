package ua.com.juja.jujarobot;


public class BubbleSorter {public static void sort(int[] arr) {
    for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
        for (int index = 0; index < barrier; index++) {
            if (arr[index + 1] < arr[index]) {
                int tmp = arr[index + 1];
                arr[index + 1] = arr[index];
                arr[index ] = tmp;
            }
        }
    }
}
}
