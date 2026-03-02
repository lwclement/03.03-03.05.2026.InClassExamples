public class EmployeeClient {

    public static void main(String[] args) {
	    Employee e = new Employee(5);
	    Secretary s = new Secretary(5);
	    Lawyer l = new Lawyer(5);
	    Marketer m = new Marketer(5);
	    LegalSecretary ls = new LegalSecretary(5);

		printInfo(e);

		System.out.println();

		printInfo(s);	// print info for Secretary
		s.takeDictation("Meeting notes");

		System.out.println();

		printInfo(l);	// print info for Lawyer
		l.sue();

		System.out.println();

		printInfo(m);	// print info for Marketer
		m.advertise();

		System.out.println();

		printInfo(ls);	// print info for Legal Secretary
		ls.takeDictation("Legal meeting notes");
		ls.fileLegalBriefs();
    }

	public static void printInfo(Employee e) {
		System.out.println("salary: " + e.getSalary());
		System.out.println("v.days: " + e.getVacationDays());
		System.out.println("v.form: " + e.getVacationForm());
	}
}
