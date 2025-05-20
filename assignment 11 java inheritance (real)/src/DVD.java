public class DVD extends LibraryItem {

    private String director;
    private int duration; // minutes 
    private String ageRating;

    public DVD(String title, String genre, String language, boolean isAvailable, int publicationYear, String director, int duration, String ageRating) {
        super(title, genre, language, isAvailable, publicationYear);
        this.director = director;
        this.duration = duration;
        this.ageRating = ageRating;
    }

    public boolean longMovie() {
        return duration > 180;
    }

    public String ratingDescription() {
        return title + " is rated " + ageRating + ". Viewer discretion may be advised.";
    }

    public boolean isFamilyFriendly() {
        return ageRating.equals("G") || ageRating.equals("PG");
    }

    public String movieTrailer() {
        return "Watch the exciting movie, " + title + ", directed by " + director + "!";
    }

}
