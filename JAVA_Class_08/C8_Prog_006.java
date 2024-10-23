// Conditional: Positive or Negative

import java.util.Scanner;
public class PostiveOrNegative
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter an integer: ");
        n=sc.nextInt();
        System.out.println((n>0)?‘Positive”:((n<0)?"Negative":"Zero"));
    }
}