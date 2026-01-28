import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(Math.abs(n)==n? 1: -1);
    }
}