/** Create a Java class named Student to demonstrate encapsulation by encapsulating the details of a student.
    Let's assume that each student to have attributes like:
    * name - representing the name of the student, stored as a String.
    * age - representing the age of the student, stored as a String.
    * major - representing the major of the student, stored as a String.
    * gpa - representing the GPA of the student, stored as a double.
    Instance Variables
    * The student class declares four instance variables: name, age, major, and gpa. These variables are marked as private 
      using the private access specifier.
    * This means the they can only be accessed within the Student clas itself and not from outside the class.
 */
public class GetSetStudent
{
    private String name;
    private int age;
    private String major;
    private double gpa;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getMajor()
    {
        return major;
    }
    public void setMajor(String major)
    {
        this.major = major;
    }
    public double getGpa()
    {
        return gpa;
    }
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
    
}