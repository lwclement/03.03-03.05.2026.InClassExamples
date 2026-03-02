// A class to represent legal secretaries
public class LegalSecretary extends Secretary {
    @Override
    public double getSalary() {
        return 45000.0;     // $45,000.00 / year
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
}
