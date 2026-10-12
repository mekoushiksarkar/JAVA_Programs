// Program to demonstrate the use of 2D array of strings in Java

class Main
{
    public static void main(String[] args)
    {
        int i,j;
        String m[][]={{"Gutu","Ghanta","Babai","Puku"},{"Gulu","Bhoomi","Mom","Rani"},{"Lullu","Bubli","Bobo","Babi"}};
        System.out.println("The elements of 3*4 Matrix are:");
        for(i=0;i<3;i++)
        {
             for(j=0;j<4;j++)
             {
                 System.out.print(m[i][j]+"   ");
             }
              System.out.println();
        }
    }
}


// o/p

// The elements of 3*4 Matrix are:
// Gutu   Ghanta   Babai   Puku   
// Gulu   Bhoomi   Mom   Rani   
// Lullu   Bubli   Bobo   Babi   

// === Code Execution Successful ===