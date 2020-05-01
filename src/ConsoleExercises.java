import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        System.out.format("The value of pi is approximately "  + "%.2f%n", pi);
        System.out.println("Please enter an integer: ");
        int aNumber = scanner.nextInt();
        System.out.printf("%d is your number." , aNumber);

    }
}
