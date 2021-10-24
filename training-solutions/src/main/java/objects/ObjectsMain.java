package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());
        System.out.println();

        Book emptyBook =new Book();
        System.out.println(emptyBook);
        emptyBook=null;
        System.out.println(emptyBook);
        System.out.println("Is emptyBook null: "+(emptyBook==null));
        System.out.println();

        Book book =new Book();
        System.out.println(book);
        book=null;
        System.out.println(book);
        book =new Book();
        System.out.println(book);
        System.out.println();

        Book anotherBook =new Book();
        System.out.println("Are identical book and anotherBook: "+(book==anotherBook));
        anotherBook=book;
        System.out.println("Are identical book and anotherBook: "+(book==anotherBook));
        System.out.println();
        System.out.println();

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

        System.out.println();
        System.out.println("A létrehozott objektumok száma: 5");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
        System.out.println(book6);
        System.out.println(book7);
        System.out.println("A hozzáférhető objektumok száma: 3");
        System.out.println();

        Book[] bookArray={book1,book2,book3};
        System.out.println("The array contains: "+Arrays.toString(bookArray));
        List<Book> booklist= Arrays.asList(bookArray);
        System.out.println("The first list contains: "+booklist);
        List<Book> bookList2 = new ArrayList<>();
        bookList2.add(book1);
        bookList2.add(book2);
        bookList2.add(book3);
        System.out.println("The second list contains: "+booklist);

    }
}
