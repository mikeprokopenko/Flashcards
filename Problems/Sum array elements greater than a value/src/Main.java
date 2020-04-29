import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfElements = scan.nextInt();

        int [] arrayOfEnteredElements = new int [numberOfElements];

        for (int i = 0; i < arrayOfEnteredElements.length; i++) {
            arrayOfEnteredElements[i] = scan.nextInt();
        }

        int n = scan.nextInt();
        int sum = 0;

        for (int arrayOfEnteredElement : arrayOfEnteredElements) {
            if (arrayOfEnteredElement > n) {
                sum += arrayOfEnteredElement;
            }
        }

        System.out.println(sum);
    }
}