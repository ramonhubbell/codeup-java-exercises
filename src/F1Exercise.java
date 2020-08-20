import java.util.Arrays;

public class F1Exercise {

    public static void main(String[] args) {

//        printFooBarBaz();
        System.out.println(reverseCharacters("the cat is fat"));
        System.out.println(reverseCharacters("band camp is great!"));

    }

//    private static void printFooBarBaz() {
//        for ( int i = 1; i <= 100; i += 1){
//            if ( i % 2 == 0 && i % 3 == 0) {
//                System.out.println( "baz" );
//            } else if ( i % 2 == 0) {
//                System.out.println( "foo" );
//            } else if ( i % 3 == 0) {
//                System.out.println( "bar");
//            } else {
//                System.out.println( i );
//            }
//        }
//    }

public static String reverseCharacters(String sentence) {
    String [] arrayWords = sentence.split(" ");
    String [] reversedWords = new String[arrayWords.length];
    for(int i=0; i<arrayWords.length; i++)
    {
        //added for setting element as emptyString instead of null
        reversedWords[i] = "";
        for(int j = arrayWords[i].length() - 1; j >= 0; j--)
        {
            reversedWords[i] += arrayWords[i].substring( j, j + 1);
        }
    }
    String newString = String.join (" ", reversedWords);
    return newString;
}


}
