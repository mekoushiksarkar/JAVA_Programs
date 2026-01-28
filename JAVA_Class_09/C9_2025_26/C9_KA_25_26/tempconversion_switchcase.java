/*
 * Using Switch statement write a menu driven program to convert a given from farhenheit scal to celcius scale and vice versa.
 * For an incorrect choice leave a meaningful statement.
 * HINT- C=5/4(F-32) and F=1.8*C+32 
 */

import java.util.*;   
public class tempconversion_switchcase
{
    public static void main(String[]args)
    {
        double c,f; 
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter your choice \nEnter C for celcius input \nEnter F for farhenhiet input "); 
        char t = sc.next().charAt(0);
        
        switch(t)
        {
            case 'C':
            System.out.println("Enter the celcius temperature value--> ");
            c=sc.nextDouble();                                                  
            f = 1.8*c+32;                                                           //calculation for farhenheit temp.
            System.out.println("Farhenheit temperature is" + f);
            break;
            
            case 'F':
            System.out.println("Enter the farhenheit temperature value--> ");
            f=sc.nextDouble();
            c = 5/4*(f-32);                                                         //calculation for celsius temp.
            System.out.println("Celcius temperature is" + c);
            break;
            
            default:
            System.out.println("!! YOUR INPUT MAY BE WRONG !!");
        }
    }
}