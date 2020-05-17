package util;

import java.util.Scanner;

public class Input {

//    Creating fields.
    private Scanner scanner = new Scanner(System.in);

//    Constructor


//    The plan template.

    public String getString() {
        System.out.println("Please type something.");
        return scanner.nextLine();
    }


    public boolean yesNo() {
        System.out.println("Do you want to continue? (y/n)");
        String response = scanner.nextLine();
        if (response.equals("y")) {
            return true;
        }
        return false;
    }

    public int getInt(int min, int max) {
        System.out.println("Please enter an integer between " + min + " and " + max);
        int intResponse = Integer.parseInt(scanner.nextLine());
        if (intResponse < min || intResponse > max) {
            System.out.println("You entered an invalid integer. Please try again.");
            return getInt(min, max);
        } else {
            System.out.println("You entered a valid integer.");
        }
        return intResponse;
    }

    public int getInt() {
        System.out.println("Please enter an integer.");
        int intResponse = Integer.parseInt(scanner.nextLine());
        return intResponse;
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a decimal from " + min + " to " + max);
        double decimalResponse = Double.parseDouble(scanner.nextLine());
        if (decimalResponse < min || decimalResponse > max) {
            System.out.println("You entered an invalid decimal. Please try again.");
            return getDouble(min, max);
        } else {
            System.out.println("You entered a valid decimal");
        }
        return decimalResponse;
    }

    public double getDouble() {
        System.out.println("Please enter a decimal");
        double doubleResponse = Double.parseDouble(scanner.nextLine());
        return doubleResponse;
    }



}
