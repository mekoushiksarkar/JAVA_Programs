/** Define a class to accept the gmail id and check for its validity.
 * A gmail id is valid only if it has:
 * @
 * .(dot)
 * gmail
 * com
 * Example: icse2024@gmail.com is a valid gmail id
 */
public class Email
{
    public static boolean IsValidEmailId(String email)
    {
        //Check if the email contains "@" and get its position
        int atIndex = email.indexOf("@");
        if (atIndex == -1)
        {
            return false;
        }
        //Check if the email contains a "." after "@"
        int dotIndex = email.indexOf(".", atIndex);
        if(dotIndex == -1)
        {
            return false;
        }
        // Check if the email ends with "gmail.com"
        String domain = email.substring(atIndex + 1);
        if (!domain.equals("gmail.com"))
        {
            return false;
        }
        //Check if the part before "@" is not empty
        String initialPart = email.substring(0, atIndex);
        if (initialPart.equals(""))
        {
            return false;
        }
        //If all checks pass, the email is valid
        return true;
    }
    public static void main(String args[])
    {
        String email1 = "icse2024@gmail.com";
        String email2 = "NotValid";
        String email3 = "NotValid@";
        String email4 = "NotValid@gamil";
        String email5 = "NotValidgmail.com";
        String email6 = "@gmail.com";
        System.out.println(email1 + " : " + IsValidEmailId(email1));
        System.out.println(email2 + " : " + IsValidEmailId(email2));
        System.out.println(email3 + " : " + IsValidEmailId(email3));
        System.out.println(email4 + " : " + IsValidEmailId(email4));
        System.out.println(email5 + " : " + IsValidEmailId(email5));
        System.out.println(email6 + " : " + IsValidEmailId(email6));
    }
}