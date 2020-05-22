package util;


//Create another class named InputTest that has a static main method
// that uses all of the methods from the Input class.

public class InputTest {

    public static void main(String[] args) {
        System.out.println("InputTest is ready!");

        Input input   = new Input();
        System.out.println( "input.getString(): " + input.getString());

        System.out.println( "input.yesNo(): " + input.yesNo());

        System.out.println( "input.getInt(1, 10): " + input.getInt(1, 10));

        System.out.println( "input.getInt(): " +  input.getInt());

        System.out.println( "input.getDouble(1.5, 50.6): " + input.getDouble(1.5, 50.6));

        System.out.println( "input.getDouble(): " + input.getDouble());

    }
}
