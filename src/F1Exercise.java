public class F1Exercise {

    public static void main(String[] args) {

        printFooBarBaz();

    }

    private static void printFooBarBaz() {
        for ( int i = 1; i <= 100; i += 1){
            if ( i % 2 == 0 && i % 3 == 0) {
                System.out.println( "baz" );
            } else if ( i % 2 == 0) {
                System.out.println( "foo" );
            } else if ( i % 3 == 0) {
                System.out.println( "bar");
            } else {
                System.out.println( i );
            }
        }
    }



}
