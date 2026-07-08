/* A program to compute the weighted marks for a student who scored 412 in first term, 423 in the second term and 430 in the third term
   and then computing the weighted percentage out of 500 marks. */

public class weighted_marks
{
    public static void main(String args[]) 
    {
        int term1_marks = 412;
        int term2_marks = 423;
        int term3_marks = 430;
        
        double term1_compute = 0.3;
        double term2_compute = 0.3;
        double term3_compute = 0.4;
        
        double weighted_marks = term1_marks * term1_compute + term2_marks * term2_compute + term3_marks * term3_compute;
        System.out.println("The weighted marks of the student is " + weighted_marks);
        double weighted_percentage = (weighted_marks / 500) * 100;
        System.out.println("The weighted percentage is " + weighted_percentage + "%");
    }
}