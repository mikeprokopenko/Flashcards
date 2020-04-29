import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int d1 = n / 1000;
        int d2 = n / 100 % 10;
        int d3 = n / 10 % 10;
        int d4 = n % 10;

        if (d1 == d4 && d2 == d3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}