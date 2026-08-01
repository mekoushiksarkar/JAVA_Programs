/* Parsing.java */
public class Parsing
{
    public static void main(String args[])
    {
        String strInt = "1234";
        int numInt = Integer.parseInt(strInt);
        System.out.println("Integer value is: " + numInt);
        String strLong = "456789";
        long numLong = Long.parseLong(strLong);
        System.out.println("Long value is: " + numLong);
        String strFloat = "-345.25";
        float numFloat = Float.parseFloat(strFloat);
        System.out.println("Float value is: " + numFloat);
        String strDouble = "1245863.23564";
        double numDouble = Double.parseDouble(strDouble);
        System.out.println("Double value is: " + numDouble);
    }
}