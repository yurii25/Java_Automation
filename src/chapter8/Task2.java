package chapter8;

import chapter7.Book;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Book book1 = new Book(100, "War and Peace", "hard", 500);
        Book book2 = new Book(120, "To Kill a Mockingbird", "hard", 256);
        Book book3 = new Book(110, "1984", "hard", 214);
        Book book4 = new Book(150, "The Lord of the Rings", "soft", 423);
        Book book5 = new Book(130, "The Great Gatsby", "soft", 325);

        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        bookCollection.add(book4);
        bookCollection.add(book5);

        try {
            bookCollection.get(5);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index 5 out of bounds for length 5");
        }

    }
}
