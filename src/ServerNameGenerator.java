public class ServerNameGenerator {

//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

//    String [] adjectives = {"aggressive", "rich", "lively", "enthusiastic", "vivacious", "healthy", "curious", "funny", "courageous", "purposeful"};
//
//    String [] nouns = {"mother", "student", "man", "patriotism", "city", "restaurant", "tiger", "dog", "love", "developer"};

//    Create a method that will return a random element from an array of strings.

    public static String getRandomString (String [] anArray) {
//    String rand = (int)(Math.random() * range) + min;
        int randomIndex = (int) (Math.random() * 10);
        return anArray[randomIndex];
    }

//    Add a main method, and inside of your main method select and random noun and
//    adjective and hyphenate the combination and display the generated name to the user.

    public static void main ( String [] args ) {
        System.out.println("ServerNameGenerator exercise is ready!");

        String [] adjectives = {"aggressive", "rich", "lively", "enthusiastic", "vivacious", "healthy", "curious", "funny", "courageous", "purposeful"};

        String [] nouns = {"mother", "student", "man", "patriotism", "city", "restaurant", "tiger", "dog", "love", "developer"};

        System.out.println("Here is your server name:");
        System.out.println(getRandomString(adjectives) + "-" + getRandomString(nouns));


    }


}
