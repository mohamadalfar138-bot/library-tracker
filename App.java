public class App {

    static void printBanner() {
        System.out.println("=== Library Tracker - Remove Book by Mohammad ===");
        System.out.println("=== Library Tracker - Add Book by Mohammad ===");
    }

    static void addBook(String title) {
        System.out.println("Added book: " + title);
    }

    static void listBooks() {
        System.out.println("Listing books from books.json...");
        System.out.println("- Clean Code");
        System.out.println("- Effective Java");
    }

    public static void main(String[] args) {
        printBanner();
        addBook("Clean Code");
        listBooks();
    }
}