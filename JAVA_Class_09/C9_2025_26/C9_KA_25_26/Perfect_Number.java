/* PerfectNumber.java */

import java.util.*;
public class Perfect_Number
{
    public static void main(String args[]) {
        int sum = 0;
        int i = 1;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scnr.nextInt();
        do
        {
            if (num % i == 0)
            sum+=i;
            i++;
        }
        while (i <= num/2);
        if(sum == num)
            System.out.println(num + " is a Perfect number");
        else
            System.out.println(num + " is not a Perfect number");
        scnr.close();
    }
}