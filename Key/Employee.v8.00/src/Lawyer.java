// A class to represent lawyers
public class Lawyer extends Employee {
    public Lawyer() { super(0); }
    public Lawyer(int years) {
        super(years);
    }

    // overrides getVacationForm method in Employee class
    public String getVacationForm() {
        return "pink";
    }

    @Override
    public int getVacationDays() {
        return 15;  // 3 weeks vacation
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 5000 * getYears();
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
