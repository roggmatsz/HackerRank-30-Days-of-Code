import java.util.*;
import java.io.*;

abstract class Book {
    protected String title;
    protected String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }
    public abstract void display();
}

class MyBook extends Book {
    String innerPrice;

    MyBook(String title, String author,
        String price) {
        super(title, author);
        this.innerPrice = price;
    }

    void display() {
        System.out.println(
            "Title: " + super.title +
            "\nAuthor: " + super.author +
            "\nPrice: " + this.innerPrice
        );
    }
}

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.ReadLine();
        String author = scanner.ReadLine();
        int price = Int32.Parse(scanner.ReadLine());
        
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }
}