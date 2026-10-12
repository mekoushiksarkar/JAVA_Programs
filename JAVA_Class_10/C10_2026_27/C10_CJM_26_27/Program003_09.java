// Program to print 2D Array

class Main
{
    public static void main(String[] args)
    {
        int i,j;
        int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
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
// 1   2   3   4   
// 5   6   7   8   
// 9   10   11   12   

// === Code Execution Successful ===