package com.Euler;

public class Euler5 {
	
	public Euler5() {
		int counter = 20;
		boolean kick = false;
	
		while (!kick) {
			
			boolean notDivisible = false;
			
			for (int a=1; a<=20; a++) {
				// if counter is not evenly divisible by var a,
				// go to next number  
				if ((counter%a) != 0) {
					notDivisible = true;
					break;
				}
			}
			
			if (!notDivisible) {
				System.out.println(counter + " is divisible by all the numbers from 1 to 20!");
				kick = true;
			}
			
			counter ++;
		}
	}
}
