import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately "  + "%.2f%n", pi);

        System.out.println("Please enter an integer: ");
        int aNumber = Integer.parseInt(input.nextLine());
        System.out.println( aNumber + " is your number.");

//        System.out.println("Please enter your first name: ");
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        String favoriteColor = input.nextLine();

        System.out.println( firstName + " is your first name.");
//        System.out.println("Please enter your last name: ");
        System.out.println( lastName + " is your last name.");
//        System.out.println("Please enter favorite color: ");
        System.out.println( favoriteColor + "is your favorite color.");

        System.out.println("Enter you favorite quote.");
        String favoriteQuote = input.nextLine();
        System.out.println("Your favorite quote is: " + favoriteQuote);

        System.out.println("What is length of the classroom?");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("What is the width of the classroom?");
        int width = Integer.parseInt(input.nextLine());

        System.out.println("The area of the classroom is: " + (length * width));
        System.out.println("The perimeter of the classroom is: " + ((length * 2) + (width * 2)));
    }
}
