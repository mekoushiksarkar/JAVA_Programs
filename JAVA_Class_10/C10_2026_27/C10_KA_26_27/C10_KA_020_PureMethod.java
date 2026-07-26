/** Demonstrating an example of pure method by taking a class named pure method */
/* PureMethodDemo.java */
class PureMethod
{
    public int PureMethod(int num)
    {
        num = 5 * num + 5;
        return num;
    }
    public static void main(String args[])
    {
        int param = 2;
        int result;
        PureMethod myObject = new PureMethod();
        System.out.println("Value of arjument before calling the PureMethod(): " + param);
        result = myObject.PureMethod(param);
        System.out.println("Return value from the PureMethod(): " + result);
        System.out.println("Value of argument after calling the PureMethod(): " + param);
    }
}