package modul_2.day_7.dodatkowe.zad_1;

public class SoundBook extends Book {
    private String duration;
    private int numbersOfCarriers;

    public SoundBook(int id, String title, String duration, int numbersOfCarriers) {
        super(id, title);
        this.duration = duration;
        this.numbersOfCarriers = numbersOfCarriers;
    }

    public SoundBook(int id, String title, Author author, String duration, int numbersOfCarriers) {
        super(id, title, author);
        this.duration = duration;
        this.numbersOfCarriers = numbersOfCarriers;
    }

    public SoundBook(int id, String title, Author author, Author[] authors, String duration, int numbersOfCarriers) {
        super(id, title, author, authors);
        this.duration = duration;
        this.numbersOfCarriers = numbersOfCarriers;
    }
}
