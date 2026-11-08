// Parameterized Constructor

class p_cs
{
    int a,b;
    p_cs(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("Value of a="+a);   
        System.out.println("Value of b="+b);  
    }
    public static void main(String[]args)
    {
        p_cs ob=new p_cs(5,8);
        ob.display();
    }
}

// o/p

// Value of a=5
// Value of b=8
