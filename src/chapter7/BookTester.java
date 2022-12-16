package chapter7;

import java.util.ArrayList;

public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book(100, "War and Peace", "hard", 500);
        Book book2 = new Book(120, "To Kill a Mockingbird", "hard", 256);
        Book book3 = new Book(110, "1984", "hard", 214);
        Book book4 = new Book(150, "The Lord of the Rings", "soft", 423);
        Book book5 = new Book(130, "The Great Gatsby", "soft", 325);
        Book book6 = new Book(170, "Pride and Prejudice", "hard", 270);
        Book book7 = new Book(140, "The Diary Of A Young Girl", "hard", 170);
        Book book8 = new Book(180, "The Book Thief", "soft", 228);
        Book book9 = new Book(200, "Fahrenheit 451", "soft", 236);
        Book book10 = new Book(300, "Jane Eyre", "hard", 324);


        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        bookCollection.add(book4);
        bookCollection.add(book5);
        bookCollection.add(book6);
        bookCollection.add(book7);
        bookCollection.add(book8);
        bookCollection.add(book9);
        bookCollection.add(book10);

        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover  = new ArrayList<>();

        System.out.println("There are next books with hard cover in the bookstore: ");

        for(Book collection: bookCollection){

            if (collection.getCoverType().equals("hard")) {

                booksWithHardCover.add(collection);
                System.out.println("*  " + collection.getTitle());

            }
        }
        System.out.println("");

        System.out.println("There are next books with soft cover in the bookstore: ");

        for(Book collection: bookCollection){

            if (collection.getCoverType().equals("soft")) {

                booksWithSoftCover.add(collection);
                System.out.println("*  " + collection.getTitle());

            }
        }



    }
}
