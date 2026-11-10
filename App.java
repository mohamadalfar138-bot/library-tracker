import java.nio.file.*;
import java.util.*;

public class App {
    static void print_banner() {
        System.out.println("=== Library Tracker - Remove Book by Mohammad ===");
        System.out.println("=== Library Tracker - Add Book by Mohammad ===");
    }
    public static void main(String[] args) throws Exception {
        print_banner();
        System.out.println(Files.readString(Path.of("books.json")));
        System.out.println("1. Add | 2. List | 3. Remove | 4. Exit");
    }
}