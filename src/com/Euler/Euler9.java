package com.Euler;


public class Euler9 {

	public Euler9() {
		
		for (int a=0; a<=1000; a++)
		{
			//System.out.println("counter = " + counter);
			for (double b=0; b<a; b++) {
				
				double c = Math.sqrt((a * a) + (b * b));
				
				// is this the triplet?
				if ((a + b + c) == 1000 && checkForDupes(a,b,c)) {
					System.out.println("Triplet found! " + a + " + " + b + " + " + c + " = " + (a+b+c));
					System.out.println("Product = " + (int)(a*b*c));
					break;
				}
			}
		}
		
		System.out.println("END");
	}
	
	boolean checkForDupes(double a, double b, double c) {
		if (a == b) return false;
		else if (a == c) return false;
		else if (b == c) return false;
		else return true;
	}
}
