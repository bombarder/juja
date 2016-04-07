package ua.com.juja.jujarobot;

public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {

        if(i == 0 && j !=0){
            b = (byte) (b | (1 << j));

        } else if(i == 1 && j != 1){
            b = (byte) (b | (0 << j));

        }
        return b;
    }


}
