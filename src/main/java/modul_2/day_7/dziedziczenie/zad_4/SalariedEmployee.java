package modul_2.day_7.dziedziczenie.zad_4;

public class SalariedEmployee extends Employee {
    public final static int hours = 190;

    public SalariedEmployee(int id, String firstName, String lastName, double hourlyWage) {
        super(id, firstName, lastName, hourlyWage);
    }

    public double calculatePayment() {
        return hours * hourlyWage;
    }
}
