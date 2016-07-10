package ua.com.juja.jujarobot;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] array = new int[]{4,3,8,5,1};
        //Random rnd = new Random(0);
        //for (int k = 0; k < array.length; k++) {
         //   array[k] = rnd.nextInt();
        //}
        long t1 = System.nanoTime();
        InsertionSorter.sort(array);
        System.out.println("A:" + (System.nanoTime() - t1) / 1_000_000);
    }
}
