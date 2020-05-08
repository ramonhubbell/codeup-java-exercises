package util;

import java.util.Scanner;

public class Input {

//    Creating fields.
    private Scanner inout = new Scanner(System.in);
    private String = userResponse;
    private int = numberInput;
    private float = decimalInput;

//    Constructor

    public Input (scanner userInput) {
    this.userInput = userInput;
    }

//    The plan template.

    public String getString() {
    return "Please enter a number from 1 to 10.";
    }


    public boolean yesNo() {
        if (userInput.equals("y")) {
            return true;
        }
        return false;
    }

    int min = 1;
    int max = 10;
    public int getInt(int min, int max) {
        if (userInput < min || userInput > max) {
            System.out.println("Please try again.");
            getString();
        } else {
            System.out.println("You entered a valid number.");
        }
        return 0;
    }

    public int getInt() {
        if (userInput < min || userInput > max) {
            System.out.println("Please try again.");
            getString();
        } else {
            System.out.println("You entered a valid number.");
        }
        return 0;
    }

    double getDouble(double min, double max){
        return 0;
    }

    double getDouble() {
        return 0;
    }



}
