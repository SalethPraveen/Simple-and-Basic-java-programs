package usingClass;

import java.util.Scanner;

public class areaOfTriangle {
	
	int b,h;
	double result;
	
	void input()
	{
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("enter b value");
	b=scan.nextInt();
	
	System.out.print("enter h value");
	h=scan.nextInt();
	
	result = (0.5) * b * h;
	
	}
	
	void output()
	{
		
		System.out.println("the Area Of Triangle is = " + result);
	}
	
		
		
		
	
	

}
