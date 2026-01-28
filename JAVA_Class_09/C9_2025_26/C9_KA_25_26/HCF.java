// WAP to find greatest common divisor of two number

import java.util.Scanner;

public class HCF
{
    public static void main(int x , int y)
    {
        int r=0;
        System.out.println("ENTERED NUMBER ARE :" + " " + x + "," + y);
        while(x!=0 && y!=0)
        {
            r=y;
            y=x%y;
            x=r;
        }
            System.out.println("GREATEST COMMON FACTOR is : " + " " + r);            
    }
}