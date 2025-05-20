public class Book extends LibraryItem {

    private String author;
    private int pageCount;
    private String isbn;

    public Book(String title, String genre, String language, boolean isAvailable, int publicationYear, String author, int pageCount, String isbn) {
        super(title, genre, language, isAvailable, publicationYear);
        this.author = author;
        this.pageCount = pageCount;
        this.isbn = isbn;
    }

    public boolean shortBook() {
        return pageCount < 100;
    }

    public String estimatedTime() {
        double minutes = pageCount / 0.75;
        return minutes + " minutes";
    }

    public String cite() {
        return author + ". (" + publicationYear + "). " + title + ".";
    }

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
