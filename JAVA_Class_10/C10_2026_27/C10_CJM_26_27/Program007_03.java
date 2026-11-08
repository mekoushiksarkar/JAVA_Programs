// Parameterized Constructor

class c_ns
{
    int a,b;
    c_ns()
    {
        a=0;
        b=0;
    }
    c_ns(int x,int y)
    {
        a=x;
        b=y;
    }
    c_ns(c_ns p)
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
        c_ns ob=new c_ns(5,8);
        c_ns ob1=new c_ns(ob);
        c_ns ob2=new c_ns(ob1);
        ob2.display();
    }
}

// o/p
// value of a=5
// value of b=8
