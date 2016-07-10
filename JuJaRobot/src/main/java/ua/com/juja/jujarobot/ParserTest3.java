package ua.com.juja.jujarobot;

/**
 * Created by nmakarov on 4/14/2016.
 */
public class ParserTest3 {

    public static void main(String[] args) {
        if (Parser.eval("159/15") != 10) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
