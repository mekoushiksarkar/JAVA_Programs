// Parameterized Constructor

class c_cs
{
    int a,b;
    c_cs(int x,int y)
    {
        a=x;
        b=y;
    }
    c_cs(c_cs p)
    {
        a=p.a;
        b=p.b;
    }
    void display()
    {
        System.out.println("value of a="+a);
        System.out.println("value of b="+b);
    }
    public static void main(String[]args)
    {
        c_cs ob=new c_cs(5,8);
        c_cs ob1=new c_cs(ob);
        ob1.display();
    }
}

// o/p
// value of a=5
// value of b=8
