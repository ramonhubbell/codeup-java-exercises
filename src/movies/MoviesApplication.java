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
        int numberSelection = 0;
        do {
            System.out.println("What would you like to do?\n");
        System.out.println("0" + " - " + "exit");
        System.out.println("1" + " - " + "view all movies");
        System.out.println("2" + " - " + "view movies in the animated category");
        System.out.println("3" + " - " + "view movies in the drama category");
        System.out.println("4" + " - " + "view movies in the horror category");
        System.out.println("5" + " - " + "view movies in the scifi category");
            System.out.println("6" + " - " + "view movies in the comedy category");
            System.out.println("7" + " - " + "view movies in the musical category");
        System.out.println("Enter your choice: ");
        numberSelection = input.getInt(0, 7);

        if (numberSelection == 0) {
            System.out.println("Thank you. Have a nice day.");
        } else if (numberSelection == 1) {
            for (Movie movie : MoviesArray.findAll()) {
                System.out.println(movie.getMovie() + " -- " + movie.getCategory());
            }
        } else if (numberSelection == 2) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("animated")) {
                    System.out.println(movie.getMovie() + " -- " + movie.getCategory());
                }
            }
        } else if (numberSelection == 3) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("drama")) {
                    System.out.println(movie.getMovie() + " -- " + movie.getCategory());
                }
            }
        } else if (numberSelection == 4) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("horror")) {
                    System.out.println(movie.getMovie() + " -- " + movie.getCategory());
                }
            }
        } else if (numberSelection == 5) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("scifi")) {
                    System.out.println(movie.getMovie() + " -- " + movie.getCategory());
                }
            }
        } else if (numberSelection == 6) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("comedy")) {
                    System.out.println(movie.getMovie() + " -- " + movie.getCategory());
                }
            }
        } else if (numberSelection == 7) {
            for (Movie movie : MoviesArray.findAll()) {
                if (movie.getCategory().equals("musical")) {
                    System.out.println(movie.getMovie() + " __ " + movie.getCategory());
                }
            }
        }
    } while (numberSelection != 0);
    }

}
