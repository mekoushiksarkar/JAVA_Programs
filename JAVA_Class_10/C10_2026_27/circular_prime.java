// Program to check if number is circular prime or not

import java.util.Scanner;

public class CircularPrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) 
            return false;
        if (num == 2) 
            return true;
        if (num % 2 == 0) 
            return false;
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }

    // Function to count the number of digits in a number
    public static int getDigitCount(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER INTEGER TO CHECK (N): ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("INVALID INPUT");
            return;
        }

        int digitCount = getDigitCount(n);
        int divisor = (int) Math.pow(10, digitCount - 1);
        int currentNum = n;
        boolean isCircularPrime = true;

        System.out.println("\nRotations:");
        // Loop through all possible rotations of the number
        for (int i = 0; i < digitCount; i++) {
            System.out.println(currentNum);
            
            // Check if the current rotation is prime
            if (!isPrime(currentNum)) {
                isCircularPrime = false;
            }

            // Perform a left cyclic shift (e.g., 197 becomes 971)
            int firstDigit = currentNum / divisor;
            int remainingDigits = currentNum % divisor;
            currentNum = (remainingDigits * 10) + firstDigit;
        }

        // Print final result
        if (isCircularPrime) {
            System.out.println("\n" + n + " IS A CIRCULAR PRIME.");
        } else {
            System.out.println("\n" + n + " IS NOT A CIRCULAR PRIME.");
        }
        
        in.close();
    }
}
