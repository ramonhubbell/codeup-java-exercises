package movies;

import util.Input;

public class MoviesApplication {

    static Input input = new Input();

    public static void main(String[] args) {
        System.out.println("MoviesApplication is ready!");
//        Give the user a list of options for viewing all the
//        movies or viewing movies by category.

    movieCategories();
    }

    public static void movieCategories () {
        System.out.println("What would you like to do?\n");
        System.out.println("0" + " - " + "exit");
        System.out.println("1" + " - " + "view all movies");
        System.out.println("2" + " - " + "view movies in the animated category");
        System.out.println("3" + " - " + "view movies in the drama category");
        System.out.println("4" + " - " + "view movies in the horror category");
        System.out.println("5" + " - " + "view movies in the scifi category\n");
        System.out.println("Enter your choice: ");
        int numberSelection  = input.getInt(0,5);

        if (numberSelection == 0) {
            System.out.println("Thank you. Have a nice day.");
        } else if (numberSelection == 1) {
        for ( Movie movie : MoviesArray.findAll() ) {
            System.out.println(movie.getMovie() + " -- " + movie.getCategory());
        }
        } else if (numberSelection == 2) {
        for (Movie movie : MoviesArray.findAll()){
            if (movie.getCategory().equals("animated")){
                System.out.println( movie.getMovie() + " -- " + movie.getCategory());
            }
        }
        }

    }

}
