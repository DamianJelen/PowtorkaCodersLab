package modul_2.day_7.dodatkowe.zad_1;

public class Book {
    private int id;
    private String title;
    private boolean available;
    private Author author;
    private Author[] authors;

    public Book(int id, String title) {
        new Book(id, title, null, null);
    }

    public Book(int id, String title, Author author) {
        new Book(id, title, author, null);
    }

    public Book(int id, String title, Author author, Author[] authors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.authors = authors;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
}
