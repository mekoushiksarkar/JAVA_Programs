/* MinutesIntoHours.java */

public class Minutes_into_Hours_Parameters {

  public static void main(int totalMinutes) {
    int hours, minutes;
    hours = totalMinutes / 60; //integer division
    minutes = totalMinutes % 60; //remainder
    System.out.println("Entered minutes:  " + totalMinutes);
    System.out.println("There are " + hours +" hours and " + minutes +" minutes in " + totalMinutes +" minutes.");
  }
}
