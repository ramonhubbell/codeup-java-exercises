package movies;

public class Movie {

//    It should have private fields for name and category,
//    and a constructor that sets both of these. Create methods
//    to access these properties and change them (getters and setters).
    private String name;
    private String category;

//    Constructor.
    public Movie (String movieName, String movieCategory) {
        this.name = movieName;
        this.category =  movieCategory;
    }


//    Methods
//    setMovie()
    public void setMovie(String aMovie) {
    this.name = aMovie;
    }
//    getMovie()
    public String getMovie() {
        return this.name;
    }

//    setCategory()
    public void  setCategory (String aCategory) {
        this.category = aCategory;
    }
//    getCategory()
    public String getCategory() {
        return this.category;
    }

//    Download the MoviesArray file and save it as MoviesArray.java inside
//    of movies. This class has a static method named findAll that will return
//    an array of Movie objects.



}
