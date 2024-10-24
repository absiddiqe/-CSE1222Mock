package q1;

public class Director extends Supervisor {

    Director(String name, double wage, String division) {
        super(name, wage, division);
    }

    @Override
    public String toString() {
        return "Director: " + getName() + ", Division: " + getDivision() + ", Wage" + getWage();
    }
}
