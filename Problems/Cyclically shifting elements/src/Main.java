import java.util.Scanner;

class Main {
    public static void main(String... args) {
        final Scanner scan = new Scanner(System.in);

        final int n = scan.nextInt();

        int[] initialArray = new int[n];
        int[] modifiedArray = new int[n];

        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = scan.nextInt();
        }

        modifiedArray[0] = initialArray[initialArray.length - 1];
        System.arraycopy(initialArray, 0, modifiedArray, 1, modifiedArray.length - 1);

        for (int i : modifiedArray) {
            System.out.print(i + " ");
        }
    }
}