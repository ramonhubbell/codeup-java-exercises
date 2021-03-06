import java.util.Scanner;

public class MethodsExercises {
    public static void main (String[] args) {
        System.out.println("Methods exercise is ready!");
        Scanner input = new Scanner (System.in);
        System.out.println("sum() " + sum(1, 2));
        System.out.println("minus() " + minus(1, 2));
        System.out.println("multiply() " + multiply(2, 4));
        System.out.println("divide() " + divide(28, 4));
        System.out.println("modulus() " + modulus(28,5));
        getInteger(1, 10);
        getFactorial(input);
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
//The method signature should look like this:
//public static int getInteger(int min, int max);
//and is used like this:
//    System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);


    int userInput = getInteger(1, 10);

    public static int getInteger( int min, int max ) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scan.nextInt();
        if ( userInput > min && userInput < max) {
            System.out.println("You entered a valid number.");
            return 0;
        } else {
            System.out.println("You entered and invalid number, try again.");
            return getInteger(min, max);
        }


    }

//3.  Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:

    public static long getFactorial (Scanner scan){
        System.out.print("Enter a number between 1 and 10: ");
        int numberInput = scan.nextInt();
        boolean userContinues = true;
        long result = 1;
        for ( int i = 1; i <= numberInput; i++ ) {
           result = result * i;
           System.out.println( (numberInput - (numberInput - i)) + "! = " + result);
        }

        System.out.print("Would you like to enter another number (y/n)? ");
            String userResponse = scan.next();
            if (userResponse.equalsIgnoreCase("y")) {
                getFactorial(scan);
            }
            return result;
    }

//   4.  Create an application that simulates dice rolling.
//       Ask the user to enter the number of sides for a pair of dice.
//       Prompt the user to roll the dice.
//       "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//       Use static methods to implement the method(s) that generate the random numbers.
//       Use the .random method of the java.lang.Math class to generate random numbers.







}
