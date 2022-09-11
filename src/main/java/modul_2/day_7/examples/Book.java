package modul_2.day_7.examples;

public class Book {
    public String name;
    public double price;
    public String Author;

    public Book() {
        System.out.println("Parent constructor");
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        Author = author;
    }

    public void printBook() {
        System.out.println("Drukowanie Book");
    }

    public static void hiddenMethod() {
        System.out.println("Parent hidden method.");
    }
}
