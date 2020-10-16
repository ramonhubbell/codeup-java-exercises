public class TestExercises {

    static int count = 0;

    public static void main(String[] args) {

//        String message = "Hello";
//        for (int i = 0; i < message.length(); i++){
//            System.out.println(message.charAt(i + 1));
//        }

        if(count < 3) {
            count ++;
            main(null);
        }else{
            return;
        }
        System.out.println("Hello World!");
    }
}
