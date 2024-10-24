package q2;

public class Runner {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);

        matrix.Set(0, 0, "Hi");
        matrix.Set(1, 1, ", It's");
        matrix.Set(2, 2, " ABSiddique");

        System.out.println("At (0, 0): " + matrix.get(0, 0));
        System.out.println("At (1, 1): " + matrix.get(1, 1));
        System.out.println("At (2, 2): " + matrix.get(2, 2));
    }
}
