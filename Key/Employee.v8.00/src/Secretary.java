// A class to represent secretaries
public class Secretary extends Employee {
    public Secretary() { super(0); }
    public Secretary(int years) {
        super(years);
    }

    @Override
    public int getSeniorityBonus() {
        return 0;
    }

    public void takeDictation(String text) {
        System.out.println("Taking dication of text: " + text);
    }
}