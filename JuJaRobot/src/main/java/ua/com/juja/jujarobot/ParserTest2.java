package ua.com.juja.jujarobot;

/**
 * Created by nmakarov on 4/14/2016.
 */
public class ParserTest2 {
    public static void main(String[] args) {
        if (Parser.eval("333-123") != 210) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
