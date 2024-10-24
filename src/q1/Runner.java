package q1;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new Worker("Money", 1);
        Supervisor supervisor = new Supervisor("Cyber", 1, "Terror");
        Director director = new Director("Battle", 1, "Necessary");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}
