/** Illustrating an example of a default constructor by creating a class named Student2 */
/* Student2.java */
class Student2
{
    int rollNumber;
    char grade;
    public Student2()       //Constructor
    {
        System.out.println("Inside Constructor");
        rollNumber = 17;
        grade = 'Z';
    }
    public void DisplayData()
    {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    public static void main(String args[])
    {
        Student2 student2 = new Student2();
        student2.DisplayData();
    }
}