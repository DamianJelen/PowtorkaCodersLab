package modul_2.day_6.metody.zad_3;

public class Person extends modul_2.day_6.metody.zad_2.Person {
    public String getFullName() {
        return getName() + " " + getSurname();
    }

    public int increaseAge() {
        int age = getAge() + 1;
        setAge(age);
        return getAge();
    }
}
