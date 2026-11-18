// Compute Pi using the Leibniz formula

import java.util.Scanner;

public class PiApproximation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Iteration (more than 1000): ");
        int numIterations = scanner.nextInt();
        
        double pi = 0.0;
        int sign = 1;

        for (int i = 0; i < numIterations; i++) {
            double denominator = (2 * i) + 1;
            pi = pi + (sign * (4.0 / denominator));
            sign = sign * -1; // Alternate the sign
        }

        System.out.println("Approximation of Pi after " + numIterations + " iterations: " + pi);
    }
}