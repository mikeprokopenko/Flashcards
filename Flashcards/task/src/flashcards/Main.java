package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of cards:");
        int numberOfCards = scanner.nextInt();

        String[] terms = new String[numberOfCards];
        String[] definitions = new String[numberOfCards];
        for (int i = 0; i < numberOfCards; i++) {
            System.out.println("The card #" + (i  + 1) + ":");
            do {
                terms[i] = scanner.nextLine();
            } while (terms[i].equals(""));
            System.out.println("The definition of the card #" + (i + 1) + ":");
            do {
                definitions[i] = scanner.nextLine();
            } while (definitions[i].equals(""));
        }

        for (int j = 0; j < numberOfCards; j++) {
            System.out.println("Print the definition of \"" + terms[j] + "\":");
            String answer = scanner.nextLine();
            System.out.println(answer.equalsIgnoreCase(definitions[j]) ? "Correct answer." : ("Wrong answer. The correct one is \"" + definitions[j] + "\""));
        }
    }
}
