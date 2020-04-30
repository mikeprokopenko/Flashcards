import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        long firstTimeInSeconds = calculateSeconds();
        long secondTimeInSeconds = calculateSeconds();

        System.out.println(secondTimeInSeconds - firstTimeInSeconds);

    }

    public static long calculateSeconds() {
        final Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        return hours * 3600 + minutes * 60 + seconds;
    }
}