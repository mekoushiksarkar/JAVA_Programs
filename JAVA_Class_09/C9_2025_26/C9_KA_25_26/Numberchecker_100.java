//WAP to check whether a number is more less or equal to 100

import java.util.Scanner;

public class Numberchecker_100
    {
        public static void main(String[]Args)        
        {int n = new Scanner(System.in).nextInt();
          if (n>100) {
             System.out.println("Greater than 100");
          }
          else if (n<100){
             System.out.println("Lesser than 100");
          }
          else{
              System.out.println("Equal to 100");
          }
        }
    }