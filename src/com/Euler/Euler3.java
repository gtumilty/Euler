package com.Euler;

import java.math.BigInteger;

public class Euler3 {
	
	BigInteger checkNum = new BigInteger("600851475143");
	BigInteger bigIntThree = new BigInteger("3");
	BigInteger bigIntTwo = new BigInteger("2");
	BigInteger bigIntOne = new BigInteger("1");
	BigInteger bigIntZero = new BigInteger("0");
	
	public Euler3() {
		
		System.out.println("Euler 3 START");
		// go through factors
		for (BigInteger a = checkNum.divide(bigIntTwo); a.compareTo(bigIntZero) == 1; a = a.subtract(bigIntOne)) {
			//System.out.print(a);
			// check for factor 
			if (checkNum.mod(a).compareTo(bigIntZero) == 0) {
				System.out.println(a.toString() + " is a factor");
				// check if factor is prime
				if (isPrimeBigInt(a)) {
					// success!
					System.out.println("Largest prime factor of 600851475143 is " + a.toString());
					break;
				}
			}
			//System.out.print(" - X\n");
		}
		
		System.out.println("Euler 3 END");
	}
	
	//checks whether an int is prime or not.
	boolean isPrime(int n) {

	    // check the odd numbers
	    for(int i=3; (i*i) <= n; i += 2) {
	        if(n % i == 0)
	            return false;
	    }
	    return true;
	}
	
	//checks whether an int is prime or not.
	boolean isPrimeBigInt(BigInteger n) {

	    // check the odd numbers
		// i=3; i*i <= 1
		//System.out.println("Is " + n.toString() + " prime?");
	    for(BigInteger i = bigIntThree; (i.multiply(i)).compareTo(n) < 1; i = i.add(bigIntTwo)) {
	    	//System.out.println(i.toString());
	        if(n.mod(i).compareTo(bigIntZero) == 0) {
	        	//System.out.println(n.toString() + " is NOT prime!");
	            return false;
	        }
	    }
	    
	    //System.out.println(n.toString() + " is prime!");
	    return true;
	}
}
