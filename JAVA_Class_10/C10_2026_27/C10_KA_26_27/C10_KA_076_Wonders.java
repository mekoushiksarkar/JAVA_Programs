/** Write a program to intialise the seven wonders of the world along with their locations in two different arrays.
 * Search for a name of the country input by the user. If found, display the name of the country along with its wonders, otherwise
 * display "Sorry Not Found!".
 * Seven Wonders: CHICHEN ITZA, CHRIST THE REDEEMER, TAJMAHAL, GREAT WALL OF CHINA, MACHU PICCHU, PETRA, COLOSSEUM
 * Locations:   MEXICO, BRAZIL, INDIA, CHINA, PERU, JORDAN, ITALY
 * Examples:    Country Name: INDIA         Output: INDIA TAJMAHAL
 *              Country Name: USA           Output: Sorry Not Found!
 */
/* Wonders.java */
import java.util.*;
public class Wonders
{
    public static void main (String args[]) 
    {
        String wonders[] = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL", "GREAT WALL OF CHINA", "MACHU PICHU",
            "PETRA", "COLOSSEUM"};
        String country[] = {"MEXICO", "BRAZIL", "INDIA", "CHINA","PERU", "JORDAN", "ITALY"};
        boolean found = false;
        Scanner scan = new Scanner(System.in);
        int length;
        System.out.println("Enter a name of the country:");
        String searchCountry = scan.next();
        length = searchCountry.length();
        for(int i = 0; i < 7; i++)
        {
            if (searchCountry.equals(country[i]))
            {
                System.out.println(country[i] + " " + wonders[i]);
                found = true;
            }
            break;
        }
        if (!found)
        System.out.println("Sorry Not Found");
        scan.close();
    }
    
}