// A class to represent lawyers
public class Lawyer extends Employee {
    public Lawyer(int years) {
        super(years);
    }

    @Override
    public String getVacationForm() {
        return "pink";
    }

    @Override
    public int getVacationDays() {
        int baseVacationDays = super.getVacationDays();
        return baseVacationDays + 5;  // Base vacation days PLUS 5 days (1 week)
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}