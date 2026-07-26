/** Illustrating an example of Parameterised Constructor by creating a class named Student3 */
/* Student3.java */
public class Student3
{
    int rollNumber;
    char grade;
    public Student3(int roll, char grd)
    {
        System.out.println("Inside Constructor");
        rollNumber = roll;
        grade = grd;
    }
    public void DisplayData()
    {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    public static void main(String args[])
    {
        Student3 studentA = new Student3(23, 'D');
        studentA.DisplayData();
        Student3 studentB = new Student3(27, 'A');
        studentB.DisplayData();
    }
}