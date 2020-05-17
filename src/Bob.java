import java.util.Scanner;

public class Bob {
    public static void main (String [] args) {
        System.out.println("Bob is ready!");

        Scanner input = new Scanner(System.in);

        System.out.println("Ask or tell Bob something.");
        String questionBob = input.nextLine().trim();
        System.out.println(questionBob);
        if (questionBob.endsWith("?")){
            System.out.println("Sure.");
        } else if (questionBob.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if ( questionBob.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
