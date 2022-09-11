package modul_2.day_7.dziedziczenie.zad_4;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Damian", "Jeleń", 100);
        SalariedEmployee employee2 = new SalariedEmployee(1, "Damian2", "Jeleń", 100);

        System.out.println(employee1.toString());
        employee1.raiseWage(10);
        System.out.println(employee1.toString());

        System.out.println(employee2.calculatePayment());
        employee2.raiseWage(10);
        System.out.println(employee2.calculatePayment());

    }
}
