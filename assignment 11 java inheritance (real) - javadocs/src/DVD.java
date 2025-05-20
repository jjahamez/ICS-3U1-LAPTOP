public class DVD extends LibraryItem {

    private String director;
    private int duration; // minutes 
    private String ageRating;

    /**
     * Constructer for the DVD with full properties 
     * @param title title of DVD
     * @param genre genre of DVD
     * @param language language of DVD
     * @param isAvailable availability of DVD
     * @param publicationYear publication year of DVD
     * @param director director of DVD
     * @param duration duration of DVD
     * @param ageRating age rating of DVD 
     */
    public DVD(String title, String genre, String language, boolean isAvailable, int publicationYear, String director, int duration, String ageRating) {
        super(title, genre, language, isAvailable, publicationYear);
        this.director = director;
        this.duration = duration;
        this.ageRating = ageRating;
    }

    /**
     * Checks if the movie is longer than 3 hours 
     * @return true if greater than 3 hours 
     */
    public boolean longMovie() {
        return duration > 180;
    }

    /**
     * returns description of the age rating
     * @return age rating 
     */
    public String ratingDescription() {
        return title + " is rated " + ageRating + ". Viewer discretion may be advised.";
    }

    /**
     * determines if the movie is sutiable for kids
     * @return true if rating of PG or G 
     */
    public boolean isFamilyFriendly() {
        return ageRating.equals("G") || ageRating.equals("PG");
    }

    /**
     * introduces the movie in a line
     * @return decriptional text of movie
     */
    public String movieTrailer() {
        return "Watch the exciting movie, " + title + ", directed by " + director + "!";
    }
}
