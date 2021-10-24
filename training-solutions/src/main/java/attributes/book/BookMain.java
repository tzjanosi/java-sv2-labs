package attributes.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the title of book:");
        String title=scanner.nextLine();
        Book book=new Book(title);
        System.out.println("The title of the book is: "+book.getTitle());
        System.out.println("Type in the new title of book:");
        title=scanner.nextLine();
        book.setTitle(title);
        System.out.println("The title of the book is: "+book.getTitle());

    }
}
