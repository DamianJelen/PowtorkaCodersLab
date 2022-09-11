package modul_2.day_6.dodatkowe.zad_2;

import java.util.Arrays;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        addPos(this.books);
        if (book.isAvailable()) {
            book.setAvailable(false);
            this.books[books.length - 1] = book;
            System.out.println("Dodano książkę: \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Wybrana przez Ciebie książka \"" + book.getTitle() + "\" jest niedostępna.");
        }
    }

    public Book[] addPos(Book[] books) {
        books = Arrays.copyOf(books, books.length + 1);
        return books;
    }
}
