// Series: 1x2 + 2x3 + 3x4 + ....

class Series
{
    public static void main(String[]args)
    {
        int i,s=0;
        for(i=1;i<=19;i++)
        {
            s=s+i*(i+1);
        }
        System.out.println("Sum= "+s);
    }
}