package q3;

import java.io.*;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        String WordToSearch = args[0];

        for (int i = 1; i < args.length; i++) {
            String filename = args[1];
            try (Scanner scanner = new Scanner(new File(filename))) {

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.contains(WordToSearch)) {
                        System.out.println(filename + ": " + line);
                    }

                }
            } catch (Exception e) {
                System.out.println("Error Massage: " + e.getMessage());
            }
        }
    }
}