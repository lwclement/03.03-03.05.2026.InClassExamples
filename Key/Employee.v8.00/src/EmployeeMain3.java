public class EmployeeMain3 {
    public static void main (String[] args) {
        Employee[] e = { new Lawyer(), new Secretary(), new Marketer(), new LegalSecretary() };

        for (int i = 0; i < e.length; i++) {
            System.out.println("salary: " + e[i].getSalary());
            System.out.println("v.days: " + e[i].getVacationDays());
            System.out.println();
        }
    }
}