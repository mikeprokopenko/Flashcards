import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        int numberOfCompanies = scan.nextInt();

        int[] income = new int[numberOfCompanies];
        for (int i = 0; i < income.length; i++) {
            income[i] = scan.nextInt();
        }

        int[] taxPercent = new int[numberOfCompanies];
        for (int j = 0; j < taxPercent.length; j++) {
            taxPercent[j] = scan.nextInt();
        }

        int[] totalTaxes = new int[numberOfCompanies];
        for (int k = 0; k < totalTaxes.length; k++) {
            totalTaxes[k] = income[k] * taxPercent[k];
        }

        int companyWithMostTaxes = 0;
        for (int l = 1; l < totalTaxes.length; l++) {
            if (totalTaxes[l] > totalTaxes[l-1]) {
                companyWithMostTaxes = l;
            }
        }

        System.out.println(companyWithMostTaxes + 1);
    }
}