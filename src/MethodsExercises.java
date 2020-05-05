import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args) {
        System.out.println("Methods exercise is ready!");
        Scanner input = new Scanner (System.in);
        System.out.println("sum() " + sum(1, 2));
        System.out.println("minus() " + minus(1, 2));
        System.out.println("multiply " + multiply(2, 4));
        System.out.println("divide() " + divide(28, 4));
        System.out.println("modulus() " + modulus(28,5));
        getInteger(input);
    }

    public static int sum ( int num1, int num2 ) {
        return num1 + num2;
    }

    public static int minus ( int num1, int num2 ) {
        return num2 - num1;
    }

    public static int multiply ( int num1, int num2 ) {
        return num1 * num2;
    }

    public static int divide ( int num1, int num2 ) {
        return num1/num2;
    }

    public static int modulus ( int num1, int num2 ) {
        return num1 % num2;
    }

// 2. Create a method that validates that user input is in a certain range.

    public static int getInteger(Scanner scan) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scan.nextInt();
////        int userInput = getInteger(1, 10);
        if ( userInput > 1 && userInput < 10) {
            System.out.println("You entered a valid number.");
            return 0;
        } else {
            System.out.println("You entered and invalid number, try again.");
            getInteger(scan);
        }
        return 0;
    }




}
