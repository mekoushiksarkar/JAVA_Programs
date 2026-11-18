// Check Speacial Number

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int sumFact = 0;
        
        while (n > 0) {
            int digit = n % 10;
            
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            
            sumFact = sumFact + fact;
            n = n / 10;
        }
        
        if (sumFact == originalNumber) {
            System.out.println(originalNumber + " is a special number.");
        } else {
            System.out.println(originalNumber + " is not a special number.");
        }
        sc.close();
    }
}