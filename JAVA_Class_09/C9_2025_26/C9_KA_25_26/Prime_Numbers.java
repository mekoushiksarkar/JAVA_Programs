// prime number generator between 20 and 50

public class Prime_Numbers
{
    public static void main(String args[]){
        for(int num = 20; num <= 50; num++)
        {
            boolean prime = true;
            for(int i = 2; i <= num/2; i++)
            {
                if (num % i == 0) {
                prime = false;
                // factors exist, no need to continue further
                break;
                }
            }
            if(prime)
                System.out.print(num+ "  ");
        }
    }
}