//a number is said to be a Sunny Number if √n+1 is equal to an integer

import java.util.*;
class Sunnynumber{
    static void main()
    {
        int n ;
        double s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer:");
        n=sc.nextInt();
        s=Math.sqrt(n+1);
        System.out.println((s==(int)s)?"Sunny Number":"Not a Sunny Number");
    }
}