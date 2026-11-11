// Duck Number Check Program

import java.util.Scanner;

public class DuckNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine().trim();
        
        // Check if the number starts with '0'
        if (numberStr.charAt(0) == '0') {
            System.out.println(numberStr + " is not a Duck Number.");
        } 
        else {
            // Check if there is any '0' in the remaining part of the string
            int f=0;
            for(int i=1; i<numberStr.length(); i++)            
            {
                if (numberStr.charAt(i)=='0'){
                    f=1;
                    break;
                }
            }
            if (f==1) {
                System.out.println(numberStr + " is a Duck Number.");
            } 
            else {
                System.out.println(numberStr + " is not a Duck Number.");
            }
        }
        
        scanner.close();
    }
}