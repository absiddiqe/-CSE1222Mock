package q1;

public class Supervisor extends Worker {
    private String division;
    Supervisor (String name, double wage, String division) {
        super(name, wage);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Supervisor: " + getName() + ", Division: " + getDivision() + ", Wage: " + getWage();
    }
}
