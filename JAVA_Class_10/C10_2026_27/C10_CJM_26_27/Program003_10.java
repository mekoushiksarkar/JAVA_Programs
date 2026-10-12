// Program to print 2D Array

class Main
{
    public static void main(String[] args)
    {
        int i,j;
        char m[][]={{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
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
// a   b   c   d   
// e   f   g   h   
// i   j   k   l   

// === Code Execution Successful ===