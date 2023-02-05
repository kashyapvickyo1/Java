// program to find Area and Perimeter of square and rectangle and take input their sides. 

import java.util.*;
public class AreaPerimeter {

	public static void main(String[] args)	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Read breadth and height of Rectangle  ");
		
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		
		System.out.println(" Read side of Square  ");
		
		float side=sc.nextFloat();
		
		float area_of_square=(side*side);
		float perimeter_of_square=(4*side); 
		
		float area_of_rect=b*h;
		float perimeter_of_rect =2*(b+h);
		
		System.out.println(" Area and Perimeter of Rectangle = "+area_of_rect+"\t"+perimeter_of_rect);
		System.out.println(" Area and Perimeter of Square 	 = "+area_of_square+"\t"+perimeter_of_square);
		
	}

}
