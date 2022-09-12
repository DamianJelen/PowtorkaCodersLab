package modul_2.day_7.dodatkowe.zad_1;

import java.util.Arrays;

public class User extends Person {
    private Book[] books;

    public User(String firstName, String lastName) {
        super(firstName, lastName);
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        int tmpPopularity;
        addPos(this.books);
        if (book.isAvailable()) {
            book.setAvailable(false);
            tmpPopularity = book.getPopularity();
            book.setPopularity(++tmpPopularity);
            this.books[books.length - 1] = book;
            System.out.println("Dodano książkę: \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Wybrana przez Ciebie książka \"" + book.getTitle() + "\" jest niedostępna.");
        }
    }

    public void returnBook(Book book) {
        Book[] tmpBooks = new Book[0];
        for (int i = 0; i < books.length; i++) {
            if(!books[i].equals(book)) {
                tmpBooks = addPos(tmpBooks);
                tmpBooks[tmpBooks.length - 1] = books[i];
            }
        }
        books = Arrays.copyOf(tmpBooks, tmpBooks.length);
        book.setAvailable(true);
    }

    public void returnAllBooks() {
        for (int i = 0; i < books.length; i++) {
            books[i].setAvailable(true);
        }
        books = Arrays.copyOf(books, 0);
    }

    public Book[] addPos(Book[] books) {
        books = Arrays.copyOf(books, books.length + 1);
        return books;
    }
}
