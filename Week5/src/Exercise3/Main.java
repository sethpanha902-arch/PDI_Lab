package Exercise3;


public class Main {
    public static void main(String[] args) {


        Book book1 = new Book();

 
        Book book2 = new Book(
            "Java Programming",
            "James Gosling",
            25.50
        );

        System.out.println("Book 1:");
        book1.displayDetails();

        System.out.println();

        System.out.println("Book 2:");
        book2.displayDetails();
    }
}
