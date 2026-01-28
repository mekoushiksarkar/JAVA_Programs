/* WAP to understand if ladder 
   @author Sinchan Ghosh
   */

import java.util.Scanner;

class if_ladder
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter A Marks");     
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("Your grade is A++");       
        }
        else if(marks >= 80){
            System.out.println("Your grade is A");
        }
        else if(marks >= 70){
            System.out.println("Your grade is B");
        }
        else if(marks >= 60){
            System.out.println("Your grade is C");
        }
        else if(marks >= 50){
            System.out.println("Your grade is D");
        }
        else if(marks >=40){
            System.out.println("Your grade is E");
        }
        else{
            System.out.println("You hava failed");
        }
    }
}