//ternary operator for grade calculation

import java.util.*;

public class ternary_operator
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income --------");
        int income = sc.nextInt();
        String PRINT= income>=40000 ? "You are RICH" : "You are POOR";
        System.out.println(PRINT);
    }
}
