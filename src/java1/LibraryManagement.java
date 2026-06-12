package java1;

class Book {

    private static int bookCounter = 1000;

    private int bookId;
    private String bookName;
    private String category;
    private double price;
    private int availableCopies;
    private String authorName;

     Book(String bookName, String category, double price,
                int availableCopies, String authorName) {

        this.bookId = ++bookCounter;

        if (bookName == null || bookName.trim().isEmpty()) {
            this.bookName = "Unknown";
        } else {
            this.bookName = bookName.trim();
        }

        this.category = category;

        if(price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }

        if(availableCopies < 0) {
            this.availableCopies = 0;
        } else {
            this.availableCopies = availableCopies;
        }

        this.authorName = authorName.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(bookName + " borrowed successfully.");
        } else {
            System.out.println(bookName + " is not available.");
        }
    }

    public void returnBook() {
        availableCopies++;
        System.out.println(bookName + " returned successfully.");
    }

    public void display() {
        System.out.println("\nBook ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Category : " + category);
        System.out.println("Price : " + price);
        System.out.println("Available Copies : " + availableCopies);
        System.out.println("Author : " + authorName);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Book book1 = new Book(
                "Java Programming",
                "Programming",
                550,
                5,
                " James Gosling ");

        Book book2 = new Book(
                "Python Basics",
                "Programming",
                450,
                3,
                " Guido Van Rossum ");

        Book book3 = new Book(
                "",
                "Database",
                300,
                2,
                " Oracle Team ");

        Book book4 = new Book(
                "Java Advanced",
                "Programming",
                700,
                4,
                " James Gosling ");

        Book[] books = {book1, book2, book3, book4};

        for (Book b : books) {
            b.display();
        }

        book1.borrowBook();
        book1.returnBook();

        Book costliest = books[0];
        Book cheapest = books[0];

        int javaCount = 0;
        int authorCount = 0;
        int totalInventory = 0;

        for (Book b : books) {

            if (b.getPrice() > costliest.getPrice()) {
                costliest = b;
            }

            if (b.getPrice() < cheapest.getPrice()) {
                cheapest = b;
            }
            if (b.getBookName().startsWith("Java")) {
                javaCount++;
            }

            if (b.getAuthorName().equalsIgnoreCase("James Gosling")) {
                authorCount++;
            }

            totalInventory += b.getAvailableCopies();
        }

        System.out.println("\nCostliest Book : "
                + costliest.getBookName());

        System.out.println("Cheapest Book : "
                + cheapest.getBookName());

        System.out.println("Books Starting With Java : "
                + javaCount);

        System.out.println("Books By James Gosling : "
                + authorCount);

        System.out.println("Total Inventory Copies : "
                + totalInventory);
    }
}