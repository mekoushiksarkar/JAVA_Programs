// display sum or square of sum of any two numbers

import java.util.*;
class Square
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int a,b,c,i=1,s=0;
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter two numbers:");
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            if(c>0)
                System.out.println("Sum of two numbers:"+c);
            else
            {
                s=c*c;
                System.out.println("Square of the sum:"+s);
            }
        }
    }
}

// OUTPUT

// Enter two numbers:
// 78965
// 52
// Sum of two numbers:79017
// Enter two numbers:
// 0
// -87
// Square of the sum:7569

// === Code Execution Successful ===