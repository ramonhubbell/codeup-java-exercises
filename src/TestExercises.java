import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.security.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//java.util.Calendar;

public class TestExercises {

    //    static int count = 0;
    private static final Scanner scanner = new Scanner(System.in);

    class Arithmetic {
        int add(int a, int b) {
            return a + b;
        }
    }

    class Adder extends Arithmetic {

    }

//    public static String findDay(int month, int day, int year) {
//
//        int dayOfWeek = Calendar.DAY_OF_WEEK;
//        int g = Calendar.DATE;
//        System.out.println("Calendar.getInstance(): " + dayOfWeek);
//        System.out.println(g);
//        calendar.set(month, day, year);
//        String dayOfTheWeek = ;
//        return "";
//    }

    public static void main(String[] args) throws IOException {

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
//        int mask = 0x000F;
//        int value = 0x2222;
//        System.out.println(value & mask);

//        DoNotTerminate.forbidExit();
//
//        try {
//            Scanner in = new Scanner(System.in);
//            int n = in .nextInt();
//            in.close();
//            String s=???; Complete this line below
//              String s = Integer.toString(n);
        //Write your code here


//            if (n == Integer.parseInt(s)) {
//                System.out.println("Good job");
//            } else {
//                System.out.println("Wrong answer.");
//            }
//        } catch (DoNotTerminate.ExitTrappedException e) {
//            System.out.println("Unsuccessful Termination!!");
//        }
//    }
//}

//The following class will prevent you from terminating the code using exit(0)!
//class DoNotTerminate {
//
//    public static class ExitTrappedException extends SecurityException {
//
//        private static final long serialVersionUID = 1;
//    }
//
//    public static void forbidExit() {
//        final SecurityManager securityManager = new SecurityManager() {
//            @Override
//            public void checkPermission(Permission permission) {
//                if (permission.getName().contains("exitVM")) {
//                    throw new ExitTrappedException();
//                }
//            }
//        };
//        System.setSecurityManager(securityManager);
//    }
//}

//        findDay(08, 05, 2015);
//        System.out.println("findDay(): " + findDay(11, 30, 2020));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = TestExercises.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
    }
}


//        }
//    static void print(String message){
//        System.out.print(message);
//        message += " ";
//    }
//    }
