//WAP which find whether a year is leap year or not

import java.util.*;   
public class leap_year
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A DESIRED YEAR : ");
        int l = sc.nextInt();
        if(l%4==0)
        {
            System.out.println("THE ENTERED YEAR IS LEAP YEAR");
        }
        else
        {
            System.out.println("THE ENTERED YEAR IS NOT A LEAP YEAR");
        }
    }  
}  