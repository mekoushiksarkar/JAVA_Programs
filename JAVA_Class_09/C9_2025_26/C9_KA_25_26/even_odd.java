/* WAP which checks whether a number is odd or even using if else statement */

import java.util.*;   
public class even_odd
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER-->");
        Double a = sc.nextDouble();
        if(a%2==0)
        {
            System.out.println("The number" + " " + a + " " + "is even");
        }
            else if(a%2!=0)
            {
                System.out.println("The number"  + " " +  a + " " + "is odd");
            }
        else{
            System.out.println("!!INVALID!!");
        }
    }
}    