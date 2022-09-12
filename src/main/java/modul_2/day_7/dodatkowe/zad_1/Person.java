package modul_2.day_7.dodatkowe.zad_1;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private static int nextId;

    public Person(String firstName, String lastName) {
        ++nextId;
        this.id = nextId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
