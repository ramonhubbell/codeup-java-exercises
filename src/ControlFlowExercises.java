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

//        long counter = 2;
//        do { System.out.println(counter);
//            counter = counter * counter;
//        } while (counter < 1000000);

//        For Loop
//    for (int i = 5; i <= 15; i++) {
//        System.out.printf("%d ", i);
//    }

//    for (int counter = 0; counter <= 100; counter+=2) {
//        System.out.println(counter);
//    }

//    for (int counter =100; counter >= -10; counter-=5) {
//        System.out.println(counter);
//    }

//    for (long counter = 2; counter < 1000000; counter *= counter) {
//    System.out.println(counter);
//    }

//    Fizzbuzz

        for (int i = 1; i <= 100; i++){
            if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println( i + " Fizzbuzz" );
            } else if ( i % 3 == 0) {
                System.out.println( i + " Fizz" );
            } else if ( i % 5 == 0) {
                System.out.println( i + " Buzz");
            } else {
                System.out.println( i );
            }
        }


    }
}






