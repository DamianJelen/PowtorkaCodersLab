package modul_2.day_7.dodatkowe.zad_1;

public class Author extends Person {
    private String pseudonym;

    public Author(String firstName, String lastName, String pseudonym) {
        super(firstName, lastName);
        this.pseudonym = pseudonym;
    }
}
