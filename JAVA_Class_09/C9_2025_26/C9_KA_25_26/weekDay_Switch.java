/* FindWeekDay.java */

import java.util.*;
public class weekDay_Switch
{
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String weekDay = "";
        System.out.println("Enter day number: ");
        int x = scnr.nextInt();
        switch (x)
        {
            case 1:
                weekDay = "Sunday";
                break;
            case 2:
                weekDay = "Monday";
                break;
            case 3:
                weekDay = "Tuesday";
                break;
            case 4:
                weekDay = "Wednesday";
                break;
            case 5:
                weekDay = "Thursday";
                break;
            case 6:
                weekDay = "Friday";
                break;
            case 7:
                    weekDay = "Saturday";
                    break;
            default:
                System.out.println("**** Invalid day number entered ****");
    }
    System.out.println("Weekday for the day number " + x + " is " + weekDay);
    scnr.close();
}
}