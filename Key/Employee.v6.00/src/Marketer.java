// A class to represent marketers
public class Marketer extends Employee {
    public Marketer(int years) {
        super(years);
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + 10000.0;
    }

    public void advertise() {
        System.out.println("Act now while supplies last");
    }
}
