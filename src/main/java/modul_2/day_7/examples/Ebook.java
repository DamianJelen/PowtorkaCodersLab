package modul_2.day_7.examples;

public class Ebook extends Book{
    public int sizeInMB;

    public Ebook() {
        super();
    }
    public Ebook(String name, double price, String author, int sizeInMB) {
        super(name, price, author);
        this.sizeInMB = sizeInMB;
    }

    @Override
    public void printBook() {
        System.out.println("Drukowanie eBook");
        super.printBook();
    }

    public static void hiddenMethod() {
        System.out.println("Children hidden method.");
    }
}
