package modul_2.day_7.dziedziczenie.zad_4;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Damian", "Jeleń", 68.5);
        Employee employee2 = new Employee(2, "Michał", "Ziolo", 121.21);

        System.out.println(employee1.toString());
        employee1.raiseWage(10);
        System.out.println(employee1.toString());

    }
}
