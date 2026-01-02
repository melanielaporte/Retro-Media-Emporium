/* What does the file need to do?
 * - each book is listed and protected as private
   - strings: title, author, not string: status if available or lent out
      - - loop to determine
    - string: borrower's name if lent
 */

 public class Book {
    // For each book
    private String title;
    private String author;
    private boolean isLent;
    private String borrower;

    // New book start of library, this
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        // library empty right now, need to add books
        // when the 1st book added = available
        this.isLent = false;
        // No borrowers
        this.borrower = null;
    }

    // Getters for all
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isLent() {
        return isLent;
    }
    public String getBorrower() {
        return borrower;
    }

    // loop- lend book and return it back to library
        // is the book already lent to anyone? true = not in the library, 
    public void lendBook(String borrowerName) {
        if (!isLent) {
            isLent = true;
            borrower = borrowerName;
            // display name of person who checked out the book
            // it is lent, unavailable
            System.out.println(title + " has been lent to " + borrowerName);
        // If someone tries to take a book that's already been checked out
        } else {
            System.out.println(title + " is already lent to " + borrower);
        }
    }

        // if someones returns a rogue book, not in the library list
        // if isLent is false = in the library, display message book is not lent, available  
    public void returnBook() {
        if (isLent) {
             // display name of person who checked out the book
            // it is lent, unavailable           
            System.out.println(title + " returned by " + borrowerName);
            isLent = false;
            // no borrower, checked back into library
            borrower = null;
        // If someone tries to take a book that's already been checked out
        } else {
            System.out.println(title + " was not lent out.");
        }
    }

    // display info about each book for dashboard
    public void displayInfo() {
        System.out.print(title + " by " + author);
        if (isLent) {
            System.out.println(" (Lent to " + borrower + ")");
        } else {
            System.out.println(" (Available)");
        }
    }
}
