package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        String term = scanner.nextLine();

        String definition = scanner.nextLine();

        String answer = scanner.nextLine().replaceAll(" ", "");

        System.out.println(answer.equalsIgnoreCase(definition) ? "Your answer is right!" : "Your answer is wrong...");
    }
}
