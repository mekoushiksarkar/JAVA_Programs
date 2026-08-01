/** Write a java program to initialise Wrapper class variables using the new operator */
/* WrapperUsingNewOperator.java */
public class Wrapper
{
    public static void main(String args[])
    {
        Byte varByte = new Byte((byte)90);
        Short varShort = new Short((short)2345);
        Integer varInteger = new Integer(15414321);
        Long varLong = new Long((long)547896548);
        Float varFloat = new Float((float)77.54);
        Double varDouble = new Double(124578.654);
        Character varCharacter = new Character('G');
        Boolean varBoolean = new Boolean(false);
        System.out.println("varByte: " + varByte);
        System.out.println("varShort: " + varShort);
        System.out.println("varInteger: " + varInteger);
        System.out.println("varLong: " + varLong);
        System.out.println("varFloat: " + varFloat);
        System.out.println("varDouble: " + varDouble);
        System.out.println("varCharacter: " + varCharacter);
        System.out.println("varBoolean: " + varBoolean);
    }
}