public class Book extends LibraryItem {

    private String author;
    private int pageCount;
    private String isbn;

    /**
     * Constructs a book with all properties 
     * @param title title of book
     * @param genre genre of book
     * @param language language of book
     * @param isAvailable availability of book
     * @param publicationYear publication year of the book
     * @param author author of the book
     * @param pageCount page count of the book
     * @param isbn isbn of book 
     */
    public Book(String title, String genre, String language, boolean isAvailable, int publicationYear, String author, int pageCount, String isbn) {
        super(title, genre, language, isAvailable, publicationYear);
        this.author = author;
        this.pageCount = pageCount;
        this.isbn = isbn;
    }

    /**
     * checks if book is less than 100 pages  
     * @return true if under 100 pages
     */
    public boolean shortBook() {
        return pageCount < 100;
    }

    /**
     * predicts amount of time spent reading the book 
     * @param minutes minutes reading
     * @return estimated time in minutes 
     */
    public String estimatedTime() {
        double minutes = pageCount / 0.75;
        return minutes + " minutes";
    }

    /**
     * cites the book
     * @return formatted citation of the book  
     */
    public String cite() {
        return author + ". (" + publicationYear + "). " + title + ".";
    }

    /**
     * Validates the isbn number, uses Mr. Q's code from github 
     * @return true if valid ISBN
     */
    public boolean isValidISBN() {
        if (isbn.length() != 13) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 13; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            sum += i % 2 == 0 ? digit : digit * 3;
        }
        return sum % 10 == 0;
    }
}
