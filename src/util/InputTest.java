package util;

public class InputTest {

    public static void main(String[] args) {
        System.out.println("Input test is ready.");

    Input input = new Input();
//     System.out.println("input.getString(): " + input.getString());
//
//        System.out.println("input.yesNo(): " + input.yesNo());
//
        System.out.println("input.getInt(1,10): " + input.getInt(1,10));

//        System.out.println("input.getInt(): " + input.getInt());

        System.out.println("input.getDouble(2.1,50.5): " + input.getDouble(2.1,50.5));

    }
}
