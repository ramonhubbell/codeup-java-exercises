import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestExercises {

//    static int count = 0;
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        String message = "Hello";
//        for (int i = 0; i < message.length(); i++){
//            System.out.println(message.charAt(i + 1));
//        }

//        if(count < 3) {
//            count ++;
//            main(null);
//        }else{
//            return;
//        }
//        System.out.println("Hello World!");
//        String message = "Hello";
//        print(message);
//        message = message + "World!";
//        print(message);

//        String [] array = {"abc", "2", "10", "0"};
//        List<String> list = Arrays.asList(array);
//        Collections.sort(list);
//        System.out.println(Arrays.toString(array));

//        System.out.println("Enter a number between 1 and 100: ");
//        int N = scanner.nextInt();
//        if ( N % 2 != 0 ){
//            System.out.println("Weird");
//        }else if( N % 2 == 0 && N >= 2 && N <= 5){
//            System.out.println("Not Weird");
//        }else if( N % 2 == 0 && N >= 6 && N <= 20 ){
//            System.out.println("Weird");
//        }else if (N % 2 == 0 && N > 20 && N <= 100){
//            System.out.println("Not Weird");
//        }

//        Scanner scan = new Scanner(System.in);
//        int i = Integer.parseInt(scan.nextLine());
//
//        // Write your code here.
//        double d = Double.parseDouble(scan.nextLine());
//        String s = scan.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
//            //Complete this line
            System.out.printf("%-15s" + "%03d%n", s1, x);
        }
        System.out.println("================================");
    }
//    static void print(String message){
//        System.out.print(message);
//        message += " ";
//    }
}
