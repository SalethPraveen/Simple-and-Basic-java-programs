package usingClass;

import java.util.Scanner;

public class SalesPrice {
	int productPrice;
	float disRate;
	double discountAmount ;
	double SaleRate;
	
	void discout()
	{
		
		Scanner scan = new Scanner(System.in);
	
		
	System.out.println("productPrice = ");
	productPrice = scan.nextInt();
	
	
	System.out.println("disRatet = " );
	disRate = scan.nextFloat();
	
	discountAmount = (productPrice *  disRate)/100 ;
	
	System.out.println("Discout Amoun = " + discountAmount );
	
	
		
	}
	
	void sale()
	{
		
		SaleRate = productPrice - discountAmount;
		
		
		
		System.out.println("Final Price = " + SaleRate);
		
		
		
		
		
	}
	
	
	

}
