/* What does the file need to do? 
 * It's the brain: stores all of the books in a catalog/bookshelf
 * keeps track of which user has borrowed it (Book), adds new books to library,
 * shows complete book list, lend and return books.
 */

// need an arraylist to STORE books and scanner for USER INPUT
// ***NOTE: how difficult will it be to add dvds and cds?***
import java.util.Arraylist;
import java.util.Scanner;

// declare Library class
public class Library {
    // protect ArrayLIst and Scanner
    private ArrayList<Books> books;
    private Scanner scanner;
    // initialize constructors
    public library() {
        books = new ArrayLIst<>();
        scanner = new Scanner(System.in);
    }
    // To add new book to library, user adds title & author
    public void addBook {
        // user INPUT
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();
        System.out.println("Enter book author: ");
        String title = scanner.nextLine();  
        // new book created
        Book newBook = new Book(title, author);
        books.add(newBook);
        // alert user book has been added to inventory/bookshelf
        System.out.println("Library Inventory:");
    }

    // display complete book list/inventory/collection/database?
    public void displayBooks() {
        System.out.println("Library Inventory: ");
    }

    // lend a book-need name of borrower & title
    // & display book is or not available/in library
    public void displayBooks() {
        // title user input
        System.out.println("Enter book title to borrow: ");
        String title = scanner.nextLine();

        // borrower, stored
        System.out.println("Enter name of borrower: ");
        String title = scanner.nextLine();
        

    }
    // return a book-need book title

    // store all books



}
