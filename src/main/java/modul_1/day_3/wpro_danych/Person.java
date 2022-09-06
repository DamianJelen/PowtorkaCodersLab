package modul_1.day_3.wpro_danych;

public class Person {
    private String surname;
    private String name;
    private int birthYear;
    private char sex;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (String.valueOf(birthYear).matches("[12][0-9][0-9][0-9]")) {
            this.birthYear = birthYear;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (String.valueOf(sex).matches("M|K")) {
            this.sex = sex;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", sex=" + sex +
                '}';
    }
}
