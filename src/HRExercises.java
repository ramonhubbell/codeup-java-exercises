import java.util.Arrays;
import java.util.Scanner;

public class HRExercises {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i = 0;
        int j = A.length()-1;
        while(A.charAt(i)==A.charAt(j) && i++<j--);
        if (i>j){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
