import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class ControlFlowExercises {
    public static void main (String [] args) {
        System.out.println("Hello Java World!");

        Scanner input = new Scanner(System.in);


        // While Loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }

        //Do While
//        int counter = 0;
//    do { System.out.println(counter);
//    counter+=2;
//    } while ( counter <= 100 );

//        int counter = 100;
//        do { System.out.println(counter);
//            counter-=5;
//        } while ( counter >= -10 );

//        long counter = 2;
//        do { System.out.println(counter);
//            counter = counter * counter;
//        } while (counter < 1000000);

//        For Loop
//    for (int i = 5; i <= 15; i++) {
//        System.out.printf("%d ", i);
//    }

//    for (int counter = 0; counter <= 100; counter+=2) {
//        System.out.println(counter);
//    }

//    for (int counter =100; counter >= -10; counter-=5) {
//        System.out.println(counter);
//    }

//    for (long counter = 2; counter < 1000000; counter *= counter) {
//    System.out.println(counter);
//    }

//    Fizzbuzz
//
//        for (int i = 1; i <= 100; i++){
//            if ( i % 3 == 0 && i % 5 == 0) {
//                System.out.println( "Fizzbuzz" );
//            } else if ( i % 3 == 0) {
//                System.out.println( "Fizz" );
//            } else if ( i % 5 == 0) {
//                System.out.println( "Buzz");
//            } else {
//                System.out.println( i );
//            }
//        }

//        Table of powers
//            boolean userContinue = true;
//        do {
//            System.out.println("What number would you like to go up to? ");
//            int aNumber = Integer.parseInt(input.nextLine());
//            System.out.println("Here is your table!");
//            System.out.println(" ");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= aNumber; i++) {
//                if (i == aNumber) {
//                    System.out.println(aNumber + "      | " + (aNumber * aNumber) + "       | " + (aNumber * aNumber * aNumber));
//                } else if (i < aNumber && i < 4) {
//                    System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
//                } else if (i < aNumber && i >= 4 && i > 10) {
//                    System.out.println(i + "    | " + (i * i) + "| " + (i * i * i));
//                } else {
//                    System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
//                }
//            }
//                System.out.println("Do you want to continue? (y/n)");
//                String response = input.nextLine();
//                if (!response.equals("y")) {
//                userContinue = false;
//                }
//
//        } while (userContinue);

//        4. Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
        boolean anotherGrade = true;

        do{
            System.out.println("Please enter a grade from 0 to 100: ");
        int gradeInput = Integer.parseInt(input.nextLine());
        if (gradeInput <= 100 && gradeInput >= 88) {
            System.out.println("Your grade is an A.");
        } else if (gradeInput <= 87 && gradeInput >= 80) {
            System.out.println("Your grade is a B.");
        } else if (gradeInput <= 79 && gradeInput >= 67) {
            System.out.println("Your grade is a C.");
        } else if (gradeInput <= 66 && gradeInput >= 60) {
            System.out.println("Your grade is a D.");
        } else {
            System.out.println("Your grade is an F.");
        }
        System.out.println("Would you like to continue? y/n");
        String response = input.nextLine();
        if (!response.equals("y")) {
            anotherGrade = false;
        }
    } while (anotherGrade);
    }
}






