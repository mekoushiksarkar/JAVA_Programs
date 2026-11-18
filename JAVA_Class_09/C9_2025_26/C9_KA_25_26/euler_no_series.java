// Euler Number (SUM SERIES)

import java.util.Scanner;

public class EulerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double e = 1.0;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            e = e + 1.0 / factorial;
        }

        System.out.println("Calculated value of e: " + e);
    }
}