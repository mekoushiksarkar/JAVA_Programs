import java.util.*;   
class VIBGYOR_switchcase
{
    static void main()
    {
        int n; 
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter A number");     
        n=sc.nextInt();
        
        switch(n)
        {
            case 1:
            System.out.println("violet");
            break;
            
            case 2:
            System.out.println("Indigo");
            break;
            
            case 3:
            System.out.println("Blue");
            break;
            
            case 4:
            System.out.println("Green");
            break;
            
            case 5:
            System.out.println("Yellow");
            break;
            
            case 6:
            System.out.println("Orange");
            break;
            
            case 7:
            System.out.println("Red");
            break;
            
            default:
            System.out.println("WRONG CHOICE");
        }
    }
}