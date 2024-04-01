import bookstore.core.Book;
import bookstore.inventory.*;

public class Program22_Book {
    public static void main(String[] args) {
        // Creating a sample book
        Book sampleBook = new Book("The Hexagon program", "Ghost", "777", 1023);

        // Creating an inventory manager and adding the sample book
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.addBook(sampleBook);

        // Retrieving and printing book details
        Book retrievedBook = inventoryManager.getBookDetails("777");
        if (retrievedBook != null) {
            System.out.println("Book Details:\nTitle: " + retrievedBook.getTitle()
                    + "\nAuthor: " + retrievedBook.getAuthor()
                    + "\nISBN: " + retrievedBook.getIsbn()
                    + "\nPrice: " + retrievedBook.getPrice());
        }

        // Updating stock level
        inventoryManager.updateStockLevel("777", 50);
    }
}

