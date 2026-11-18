// Check Automorphic Number

import java.util.Scanner;

public class AutomorphicNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int square = number * number;
        System.out.println("Square of number: " +square);
        int temp = number;
        
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        int lastDigits = square % (int) Math.pow(10, count);
        System.out.println("LastDigits: " +lastDigits);
        
        if (number == lastDigits) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
        scanner.close();
    }
}