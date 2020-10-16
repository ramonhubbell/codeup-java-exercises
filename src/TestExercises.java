import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestExercises {

//    static int count = 0;

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

        String [] array = {"abc", "2", "10", "0"};
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(Arrays.toString(array));
    }
//    static void print(String message){
//        System.out.print(message);
//        message += " ";
//    }
}
