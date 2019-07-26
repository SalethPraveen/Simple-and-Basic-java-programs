package usingClass;

import java.util.Scanner;

public class twopoints {
	
	int x1;
	int x2;
	int y1;
	int y2;
	int xx;
	int yy;
	double z, x , y;
	
	double distance;
	
	Scanner scan = new Scanner(System.in);
	
	void xsub()
	{
	
		System.out.println("enter x2 = ");
		x2 = scan.nextInt();
		
		System.out.println("enter x1 = ");
		x1 = scan.nextInt();
		
		xx = x2 - x1;
		
		x = Math.pow(xx, 2);
				/*(xx * xx);*/
		
	}
	
	void ysub()
	{
		
		System.out.println("enter y2 = ");
		y2 = scan.nextInt();
		
		System.out.println("enter y1 = ");
		y1 = scan.nextInt();
		
		
		yy = y2 -y1;
		
		y = Math.pow(yy, 2);
		//(yy * yy);
		
		
		
	}
	
	void Add()
	{
		z=(x + y);
		
		distance = Math.sqrt(z);
		
		
		System.out.println("Distance is = " + distance);
		
	}
	

}
