public class Main
    {
        public static void main(String[] args)
        {
            GetSetStudent student = new GetSetStudent();
            student.setName("Rohit Sharma");
            student.setAge(39);
            student.setMajor("Pull Shot");
            student.setGpa(264);
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Major: " + student.getMajor());
            System.out.println("GPA: " + student.getGpa());
        }
    }