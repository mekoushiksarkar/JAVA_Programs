// FIND THE LARGEST NUMBERS

import java.util.*;
class Largest
{
    public static void main(String[]args)
    {
        int i,n,lar=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(i=1;i<=10;i++)
        {
            n=sc.nextInt();
            if(n==1)
            lar=n;
            if(n>lar)
            lar=n;
        }
        System.out.println("Largest= "+lar);
    }
}