package modul_2.day_7.examples;

public class Examples {
    public static void main(String[] args) {
        /*Book book = new Book();
        Ebook ebook = new Ebook();
        Book book_2 = new Ebook();

        book.printBook();
        ebook.printBook();
        book_2.printBook();

        book.hiddenMethod();
        ebook.hiddenMethod();
        book_2.hiddenMethod();*/

        Parent parent = new Parent();
        Parent parent_2 = new Child();
        System.out.println(parent.getName());
        System.out.println(parent_2.getName());
    }
}
