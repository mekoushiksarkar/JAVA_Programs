import java.util.Scanner;

public class Age_SeniorCitizen_Scanner {

  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter age: ");
    int age = scnr.nextInt();
    scnr.close();

    String condition = (age >= 60)? "a senior citizen": "not a senior citizen";
    System.out.println("The person with age " + age + " years is " + condition);
  }
}
