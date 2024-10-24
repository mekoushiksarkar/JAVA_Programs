// Discounted Price

import java.util.*; 
class Discount
{
    public static void main()
    {
		Scanner obj = new Scanner (System.in);
		System.out.print (“Enter the price of the item:"); 
		double price = obj.ncxtDouble();
		doubledisAmt = 0;
		if(price > 5000)
			disAmt = price — 0.20 * price;
		else if(price > 2000)
			disAmt = price — 0.10 * price;
		else
			discAmt = price;
		System.out.print(“Discounted price is : ” + disAmt);
    }
}