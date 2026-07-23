/** Design a class Student described as below:
    Data Members/Instance Variables:
    name, age, m1, m2, m3 (marks in 3 subjects), maximum, average
    Member Methods:
    i. A parameterised constructor to initialise the data members
    ii. To accept the details of a student
    iii. To compute the average and maximum out of three subjects
    iv. To display the name, age,and marks in three subjects, maximum marks and average marks
    Write a main method to create an object of a class and call the above member methods.
 */
/* Student.java */
import java.util.Scanner;
public class Student
{
    String name;
    int age;
    int m1, m2, m3, maximum;
    double average;
    public Student()
    {
    }
    public Student(String nm, int ag, int mks1, int mks2, int mks3)
    {
        name = nm;
        age = ag;
        m1 = mks1;
        m2 = mks2;
        m3 = mks3;
        maximum = 0;
        average = 0;
    }
    public void AcceptDetails()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        System.out.print("Enter Marks in Subject1: ");
        m1 = scanner.nextInt();
        System.out.print("Enter Marks in Subject2: ");
        m2 = scanner.nextInt();
        System.out.print("Enter Marks in Subject3: ");
        m3 = scanner.nextInt();
        scanner.close();
    }
    public void Compute()
    {
        average = (m1 + m2 + m3) / 3.0;
        maximum = Math.max(m1, (Math.max(m2,m3)));
    }
    public void DisplayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks in Subject1: " + m1);
        System.out.println("Marks in Subject2: " + m2);
        System.out.println("Marks in Subject3: " + m3);
        System.out.println("Maximum Marks: " + maximum);
        System.out.println("Average Marks: " + average);
    }
    public static void main(String args[])
    {
        Student student1 = new Student();
        student1.AcceptDetails();
        student1.Compute();
        System.out.println("Student1 details *** With default constructor");
        student1.DisplayDetails();
        Student student2 = new Student("Rohit Sharma", 15, 99, 99, 98);
        System.out.println("Student2 details *** With parameterised constructor");
        student2.Compute();
        student2.DisplayDetails();
    }
}