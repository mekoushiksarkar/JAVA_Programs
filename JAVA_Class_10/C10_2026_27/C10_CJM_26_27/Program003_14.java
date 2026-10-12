// Program to find the number of students getting 80%+ and 34%- marks in Java

import java.util.*;
class Avg
{
    public static void main(String[] args)
    {
        int i,c1=0,c2=0;
        int phy[]=new int[5];
        int chem[]=new int[5];
        int maths[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the marks in physics:");
            phy[i]=sc.nextInt();
            System.out.println("Enter the marks in chemistry:");
            chem[i]=sc.nextInt();
            System.out.println("Enter the marks in maths:");
            maths[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if((phy[i]+chem[i]+maths[i])/3.0>=80)
              c1++;
            if((phy[i]+chem[i]+maths[i])/3.0>=34)
              c2++;
        }
        System.out.println("no. of students getting 80%+\t:"+c1);
        System.out.println("no. of students getting 34%-\t:"+c2);
    }
}


// o/p
// Enter the marks in physics:
// 85
// Enter the marks in chemistry:
// 96
// Enter the marks in maths:
// 95
// Enter the marks in physics:
// 99
// Enter the marks in chemistry:
// 45
// Enter the marks in maths:
// 20
// Enter the marks in physics:
// 98
// Enter the marks in chemistry:
// 99
// Enter the marks in maths:
// 100
// Enter the marks in physics:
// 55
// Enter the marks in chemistry:

// 21
// Enter the marks in maths:
// 10
// Enter the marks in physics:
// 96
// Enter the marks in chemistry:
// 25
// Enter the marks in maths:
// 33
// no. of students getting 80%+	:2
// no. of students getting 34%-	:4

// === Code Execution Successful ===