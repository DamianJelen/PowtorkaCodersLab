package modul_2.day_7.dziedziczenie.zad_4;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(int id, String firstName, String lastName, double hourlyWage) {
        super(id, firstName, lastName, hourlyWage);
    }

    public double calculatePayment(double hours) {
        double result = 0;
        if (hours < 0) {
            result = hours * hourlyWage;
        } else {
            System.out.println("The value of hours can't less than 0");
        }

        return result;
    }
}
