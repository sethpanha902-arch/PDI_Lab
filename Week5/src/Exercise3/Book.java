package Exercise3;


public class Book {

    String title;
    String author;
    double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
