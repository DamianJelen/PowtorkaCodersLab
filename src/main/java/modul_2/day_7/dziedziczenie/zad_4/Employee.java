package modul_2.day_7.dziedziczenie.zad_4;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double hourlyWage;

    public Employee(int id, String firstName, String lastName, double hourlyWage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyWage = hourlyWage;
    }

    public void raiseWage(double percent) {
        if (percent > 0) {
            hourlyWage += hourlyWage * percent / 100;
        } else {
            System.out.println("The percent should be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wage=" + hourlyWage +
                '}';
    }
}
