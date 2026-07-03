
/* A program to print the perimeter and area of a square*/

public class Square
{
    public static void main(String args[]) {
        int side_of_the_square = 76;
        int perimeter, area;
        
        perimeter = 4*side_of_the_square;
        area = side_of_the_square*side_of_the_square;
        
        System.out.println("The side of the square is " + side_of_the_square);
        System.out.println("The perimeter of the square is " + perimeter);
        System.out.println("The area of the square is " + area);
    }
}
