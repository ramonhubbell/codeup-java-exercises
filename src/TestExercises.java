import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestExercises {

    //    static int count = 0;
    private static final Scanner scanner = new Scanner(System.in);

    class Arithmetic{
        int add(int a, int b){
            return a + b;
        }
    }

    class Adder extends Arithmetic{

    }

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

//        Scanner sc = new Scanner(System.in);
//        System.out.println("================================");
//        for(int i = 0; i < 3; i++) {
//            String s1 = sc.next();
//            int x = sc.nextInt();
//            //Complete this line
//            System.out.printf("%-15s" + "%03d%n", s1, x);
//        }
//        System.out.println("================================");

//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        for (int i = 0; i < t; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int result = 0;
//            for (int u = 0; u < n; u++) {
//                if (u == 0) {
//                    result = result + (a + ((int) Math.pow(2, u) * b));
//                } else {
//                    result = result + ((int) Math.pow(2, u) * b);
//                }
//                System.out.print(result + " ");
//            }
//            System.out.println();
//        }
//            in.close();

//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i = 0; i < t; i++) {
//            try {
//                long x = sc.nextLong();
//                System.out.println(x + " can be fitted in:");
//                if(x >= -128 && x <= 127){
//                    System.out.println("* byte");
//                }
//                //Complete the code
//                if (x >= -32768 && x <= 32767){
//                    System.out.println("* short");
//                }if (x >= -2147483648 && x <= 2147483647) {
//                    System.out.println("* int");
//                }if ( x >= -9223372036854775808L && x <= 9223372036854775807L){
//                    System.out.println("* long");
//                    }
//            }
//            catch(Exception e) {
//                System.out.println(sc.next() + " can't be fitted anywhere.");
//            }
//        }
        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(value & mask);
        }
//    static void print(String message){
//        System.out.print(message);
//        message += " ";
//    }
    }
