/** Demonstrating an example of both pass by value (call by value) method and pass by reference (call by reference) method */
/* PassByValueDemo.java */
class Value_Reference
{
    int num;
    public void Compute(int n)
    {
        n = n * 2;
        System.out.println("Value in the method call: " + n);
    }
    public void TestCompute()
    {
        num = 5;    //assing a value
        System.out.println("Original value: " + num);
        Compute (num);
        System.out.println("Value after method call: " + num);
    }
    int n;
    public void Compute(Value_Reference obj)
    {
        obj.num = obj.num * 2;
        System.out.println("Value in the method call: " + obj.num);
    }
    public void testCompute()
    {
        Value_Reference testObject = new Value_Reference();
        testObject.num = 5; // assign a value
        System.out.println("Original value: " + testObject.num);
        Compute(testObject);
        System.out.println("Value after method call: " + testObject.num);
    }
}