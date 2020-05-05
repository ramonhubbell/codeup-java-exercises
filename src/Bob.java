import java.util.Scanner;

public class Bob {
    public static void main (String [] args) {
        System.out.println("Bob is ready!");

        Scanner input = new Scanner(System.in);

        System.out.println("Ask Bob a question.");
        String questionBob = input.nextLine().trim();
        System.out.println("Sure.");

        System.out.println("Yell at Bob!");
        String yellQuestionBob = input.nextLine().toUpperCase();
        System.out.println("Whoa, chill out!");

        System.out.println("Don't respond to Bob.");
        String noResponseBob = input.nextLine();
        System.out.println("Fine. Be that way!");

    }
}
