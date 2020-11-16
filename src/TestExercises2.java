import java.util.Scanner;

public class TestExercises2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int aLength = A.length();
        int bLength = B.length();
        int sumLength = aLength + bLength;
        System.out.println(sumLength);
    }
}
