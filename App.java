public class App {

    static void printBanner() {
        System.out.println("=== Library Tracker - Remove Book by Mohammad ===");
        System.out.println("=== Library Tracker - Add Book by Mohammad ===");
    }

    static void addBook(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Error: Book title cannot be empty!");
            return;
        }
        System.out.println("Added book: " + title);
    }

    static void listBooks() {
        System.out.println("Listing books from books.json...");
        System.out.println("- Clean Code");
        System.out.println("- Effective Java");
        System.out.println("Total books: 2");
    }

    public static void main(String[] args) {
        printBanner();
        addBook("Clean Code");
        listBooks();
    }
}