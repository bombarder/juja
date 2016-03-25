package ua.com.juja.jujarobot;

public class forCheck {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,8,9};
        int [] nums2 = {7,5,4,6,9,2,3,4,5};
        merge(nums, nums2);

    }

    public static int[] merge(int[] fst, int[] snd) {

        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;

        while (fstIndex + sndIndex != result.length) {
            if (fst[fstIndex] < snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            } else {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }
        return result;
    }
}




