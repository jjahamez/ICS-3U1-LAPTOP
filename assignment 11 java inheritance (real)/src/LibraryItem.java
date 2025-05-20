public class LibraryItem { //examples: movies, games, books

    protected String title;
    protected String genre;
    protected String language;
    protected boolean isAvailable;
    protected int publicationYear;

    /** 
     * Constructor with all properties
     * @param title title of item
     * @param genre genre of item
     * @param language language of item
     * @param isAvailable if the book is available or checked out
     * @param publicationYear the year the item was made/published
     */ 
    public LibraryItem(String title, String genre, String language, boolean isAvailable, int publicationYear) {
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.isAvailable = true;
        this.publicationYear = publicationYear;
    }

    /**
     * Constructor with only title and availability, rest are unknowns
     * @param title title of item
     * @param isAvailable availability 
     */
    public LibraryItem(String title, boolean isAvailable) {
        this.title = title;
        this.genre = "Unknown";
        this.language = "Unknown";
        this.isAvailable = true;
        this.publicationYear = 0;
    }

    /**
     * Checks out item if available
     * @return true if checked out successfully 
     * @return false if already checked out 
     */
    public boolean checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + "has been checked out.");
            return true;
        } else {
            System.out.println(title + "is already checked out.");
            return false;
        }
    }

    /**
     * Returns item 
     * @return true if successfully returned
     * @return false if not 
     */
    public boolean checkIn() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + "has been returned.");
            return true;
        } else {
            System.out.println(title + "wasn't checked out, can't be returned");
            return false;
        }
    }

    /**
     * @param year the comparison year of item
     * @return true if the item was older 
     */
    public boolean isOlderThan(int year) {
        return publicationYear < year;
    }

    /**
     * Returns title and language
     * @return description of the language
     */
    public String inLanguage() {
        return title + " is available in " + language + " .";
    }

    /** */
    public String inGenre() {
        return title + " is the genre of" + genre + " .";
    }

    public String displayInfo() {
        return "Title: " + title + "\nGenre: " + genre + "\nLanguage: " + language 
        + "\nPublished: " + publicationYear + "\nStatus: " + (isAvailable ? "Available" : "Checked Out");
    }

}

// ask about the protected vs private, is it fine i dont have getters/setters and just use protected 
