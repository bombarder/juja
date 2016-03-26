package ua.com.juja.jujarobot;

public class forCheck {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,8,9};
        int [] nums2 = {7,5,4,6,9,2,3,4,5};
        //merge(nums, nums2);
        System.out.println(merge(nums, nums2));

    }

    public static int[] merge(int[] fst, int[] snd) {

        int[] answer = new int[fst.length + snd.length];
        int i = 0, j = 0, k = 0;

        while (i < fst.length && j < snd.length){
            if (fst[i] < snd[j])
                answer[k++] = fst[i++];
            else
                answer[k++] = snd[j++];
        }
        while (i < fst.length)
            answer[k++] = fst[i++];

        while (j < snd.length)
            answer[k++] = snd[j++];

        return answer;
    }
}




