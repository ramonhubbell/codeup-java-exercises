public class ControlFlowExercises {
    public static void main (String [] args) {
        System.out.println("Hello Java World!");

        // While Loop
//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }

        //Do While
//        int counter = 0;
//    do { System.out.println(counter);
//    counter+=2;
//    } while ( counter <= 100 );

//        int counter = 100;
//        do { System.out.println(counter);
//            counter-=5;
//        } while ( counter >= -10 );

        long counter = 2;
//        int square = Math.pow(counter, 2);
        do { System.out.println(counter);
            counter = counter * counter;
        } while (counter < 1000000);

//        int square = Math.pow(i, 2);

    }
}






