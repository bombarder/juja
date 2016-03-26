package ua.com.juja.jujarobot;

public class ArrayFilter {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        for (int i =1; i <arr.length; i++){
            System.out.print(filterEven(arr)[i]);
        }

    }

        public static int [] filterEven(int [] nums){

            int[] evens = new int[nums.length];

            for(int i = 0, j = 0; i < nums.length-1; i++){
                if(nums[i]%2 == 0){
                    evens[j] = nums[i];
                    j++;
                } else {
                    evens[i] = 0;
                }
            }
            return evens;
        }
    }

