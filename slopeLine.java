package usingClass;

import java.util.Scanner;

public class slopeLine {
	
	
		
		int x1;
		int x2;
		int y1;
		int y2;
		int xx;
		int yy;
		int z, x , y;
		
		double distance;
		
		Scanner scan = new Scanner(System.in);
		
		void xsub()
		{
		
			System.out.println("enter x2 = ");
			x2 = scan.nextInt();
			
			System.out.println("enter x1 = ");
			x1 = scan.nextInt();
			
			xx = x2 - x1;
			
					
		}
		
		void ysub()
		{
			
			System.out.println("enter y2 = ");
			y2 = scan.nextInt();
			
			System.out.println("enter y1 = ");
			y1 = scan.nextInt();
			
			
			yy = y2 -y1;
			
			
			
			
			
		}
		
		void div()
		{
			z= yy / xx;
			
			System.out.println("distance is = " + z);
			
		}
		

	}


