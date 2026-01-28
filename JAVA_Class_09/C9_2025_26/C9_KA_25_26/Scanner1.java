//Using Scanner class for input

import java.util.Scanner;

public class Scanner1{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int n ;
        double d;
        String word;
        String line;
        System.out.println("Enter integer number, double type number, Word, Line -->");
        n=input.nextInt();
        d=input.nextDouble();
        word=input.next();                      //returns a sr=tring upto next whitespace
        line = input.nextLine();                //returns rest of line and vanishes the '\n'
        System.out.println(+n+":"+d+":"+word+":"+line);
    }
}