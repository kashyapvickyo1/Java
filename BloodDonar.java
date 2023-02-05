// program to check blood donar is eligible or not age should be 18 to 55 and weight>45

import java.util.*;
public class BloodDonar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Read Age and Weight of blood donar from keyboard  ");
		int age =sc.nextInt();
		float weight =sc.nextFloat();
		
			if((age>18 && age<=55) && weight>=45 ){
				System.out.println(" Eligible to Donate Blood   ");

						}
			else {
				System.out.println("Non-Eligible to Donate Blood  ");

			}
				
	}

}
