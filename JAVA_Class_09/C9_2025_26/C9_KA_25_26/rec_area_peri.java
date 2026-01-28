//take length and breadth of a rectangle to claculate area and perimeter//

public class rec_area_peri{
    public static void main(String[]args){
        int l=10,b=20,area,peri;
        area = l*b;
        peri=2*(l+b);
        System.out.println("Area of the rectangle is "+area);
        System.out.println("Perimeter of the rectangle is "+peri);
    }
}