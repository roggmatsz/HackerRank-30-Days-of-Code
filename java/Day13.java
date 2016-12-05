using System;
using System.Collections.Generic;
using System.IO;

abstract class Book {
    protected String title;
    protected String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }
    public abstract void display();
}

class Day13 {
    static void main(String[] args) {
        String title = Console.ReadLine();
        String author = Console.ReadLine();
        int price = Int32.Parse(Console.ReadLine());
        
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();
    }
}