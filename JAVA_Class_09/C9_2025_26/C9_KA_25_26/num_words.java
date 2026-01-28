//WAP to convert numerical into eqivalent word using switch case
import java.util.Scanner;

public class num_words{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ");
        int num = sc.nextInt();
        int reverse = 0 , remainder;
        while (num>0){
            remainder = num % 10 ;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        String result = " ";
        while (reverse > 0){
            remainder = reverse % 10 ;
            reverse = reverse / 10;
            switch (remainder){
                case 0 : System.out.print( result +"Zero");
                break;
                
                case 1 : System.out.print( result +"One");
                break;
                
                case 2 : System.out.print( result +"Two");
                break;
                
                case 3 : System.out.print( result +"Three");
                break;
                
                case 4 : System.out.print( result +"Four");
                break;
                
                case 5 : System.out.print( result +"Five");
                break;
                
                case 6 : System.out.print( result +"Six");
                break;
                
                case 7 : System.out.print( result +"Seven");
                break;
                
                case 8 : System.out.print( result +"Eight");
                break;
                
                case 9 : System.out.print( result +"Night");
                break;
                
                default :  System.out.print("!!!!! CAN'T BE COMPILED TO GENERATE ANSWER !!!!!");
                
            }
        }
    }
}