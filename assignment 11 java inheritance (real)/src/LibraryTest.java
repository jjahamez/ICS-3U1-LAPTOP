public class LibraryTest {
    public static void main(String[] args) {
        // Book about LeBron James
        Book lebronBook = new Book(
            "LeBron James: The Making of a Billion-Dollar Athlete",
            "Biography",
            "English",
            true,
            2020,
            "Brian Windhorst",
            320,
            "9780062976974"
        );

        // DVD about the Toronto Maple Leafs
        DVD leafsDVD = new DVD(
            "Toronto Maple Leafs: The Passion Returns",
            "Sports",
            "English",
            true,
            2002,
            "Maple Leaf Sports",
            90,
            "G"
        );

        // Another Book
        Book sciFiBook = new Book(
            "Dune",
            "Science Fiction",
            "English",
            true,
            1965,
            "Frank Herbert",
            412,
            "9780441013593"
        );

        // Another DVD
        DVD actionDVD = new DVD(
            "Inception",
            "Action",
            "English",
            true,
            2010,
            "Christopher Nolan",
            148,
            "PG-13"
        );

        // TEST OUTPUT
        System.out.println("--- Book: LeBron James ---");
        System.out.println(lebronBook.displayInfo());
        System.out.println("Short Book? " + lebronBook.shortBook());
        System.out.println("Valid ISBN? " + lebronBook.isValidISBN());
        System.out.println("Citation: " + lebronBook.cite());
        System.out.println(lebronBook.title + " estimated reading time: " + lebronBook.estimatedTime());

        System.out.println("\n--- DVD: Toronto Maple Leafs ---");
        System.out.println(leafsDVD.displayInfo());
        System.out.println("Family Friendly? " + leafsDVD.isFamilyFriendly());
        System.out.println("Trailer: " + leafsDVD.movieTrailer());

        System.out.println("\n--- Extra Book: Dune ---");
        System.out.println(sciFiBook.displayInfo());
        System.out.println("Is older than 1970? " + sciFiBook.isOlderThan(1970));

        System.out.println("\n--- Extra DVD: Inception ---");
        System.out.println(actionDVD.displayInfo());
        System.out.println("Long movie? " + actionDVD.longMovie());

        // Simulate check out and check in
        System.out.println("\nChecking out Dune...");
        sciFiBook.checkOut();
        System.out.println("Checking in Dune...");
        sciFiBook.checkIn();

        // === Testing LibraryItem Constructors ===
        System.out.println("\n--- Testing Full Constructor ---");
        LibraryItem fullItem = new LibraryItem("Full Constructed Item", "Non-Fiction", "Spanish", true, 2015);
        System.out.println(fullItem.displayInfo());

        System.out.println("\n--- Testing Partial Constructor ---");
        LibraryItem partialItem = new LibraryItem("Partial Constructed Item", false);
        System.out.println(partialItem.displayInfo());
    }
}
