package ua.com.juja.jujarobot;

public class MathUtils {
    public static void main(String[] args) {

        System.out.println(lookFor(14));
    }
    public static int lookFor(int max) {
        int count = 0;
        int[] inputArray = new int[max];

        for (int i = 0; i < max; i++) {
            inputArray[i] = i+1;
        }
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j <inputArray.length ; j++) {
                if (inputArray[i] * inputArray[i] +
                        inputArray[j] * inputArray[j] <= max){
                    count++;
                } else {j++;}
            }
        } return count;
    }
}
