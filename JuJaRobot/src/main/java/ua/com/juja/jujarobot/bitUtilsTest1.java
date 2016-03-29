package ua.com.juja.jujarobot;


public class bitUtilsTest1 {

    public static void main(String[] args) {
        byte b = 0b0000_0001;
        byte result = BitUtils.swapBits((byte) b, 0, 1);

        if (result != (byte)b) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }


}
