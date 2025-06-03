public class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public void borrowBook() {
        isAvailable = false;

    }

    public void displayStatus() {
        System.out.println("Book: " + title + " by " + author + "(Available: " + isAvailable);
    }
}
