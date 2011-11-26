package com.Euler;

import java.math.BigInteger;

public class Euler7 {

	// GOAL:
	// What is the 10 001st prime number?
	
	BigInteger bigIntTwo = new BigInteger("2");
	BigInteger bigIntThree = new BigInteger("3");
	
	// the nth prime to find
	BigInteger targetPrimeNum = new BigInteger("10001");
	
	public Euler7() {
		
		// the prime counter starts at one (2nd prime)
		BigInteger primeCount = BigInteger.ONE;
		// current number starts at three (2nd prime)
		BigInteger currNum = bigIntThree;
		
		boolean kick = false;
		
		System.out.println("Euler7 START");
		
		while (!kick) {
			
			System.out.print("\n" + currNum.toString());
			
			// check if this number is prime
			if (isPrimeBigInt(currNum)) {
				
				// increment total primes found
				primeCount = primeCount.add(BigInteger.ONE);
				
				System.out.print(" is prime. Current total: " + primeCount.toString() + "\n");
				
				// if we've found the prime we're looking for
				if (primeCount.compareTo(targetPrimeNum) == 0) {
					System.out.println("Prime " + targetPrimeNum.toString() + " = " + currNum.toString());
					kick = true;
				}
			}
			
			// increment current number
			currNum = currNum.add(BigInteger.ONE);
		}
		
		System.out.println("Euler7 END");
	}
	
	//checks whether an BigInteger is prime or not.
	boolean isPrimeBigInt(BigInteger n) {

		// no even numbers!
		if (n.mod(bigIntTwo).compareTo(BigInteger.ZERO) == 0) return false;
		
	    // check the odd numbers
	    for(BigInteger i = bigIntThree; (i.multiply(i)).compareTo(n) < 1; i = i.add(bigIntTwo)) {
	    	//System.out.println(i.toString());
	        if(n.mod(i).compareTo(BigInteger.ZERO) == 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}
}
