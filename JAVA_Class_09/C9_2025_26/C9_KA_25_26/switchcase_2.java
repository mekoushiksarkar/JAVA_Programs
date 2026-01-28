/*Rewrite the following set of if-else statement in terms of switch case statement for the 
following code fragment:
int code;
code=sc.nextInt();
if (code==1)
System.out.print(“Accountant”);
else
if (code==5 || code==6)
System.out.print(“Grade IV”);
else
if (code==3)
System.out.print(“Financial Advisor”);*/

import java.util.*;

public class switchcase_2{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number");   
        int code = sc.nextInt();
        switch(code){
            case 1: 		System.out.println("Accountant");	
            break;
	    case 5: case 6:	System.out.println("Grade IV"); 
	    break;
	    case 3:	        System.out.println("Financial Advisor");
        }
	
        
    }
}