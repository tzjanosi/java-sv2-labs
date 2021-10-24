package objects;

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


    }
}
