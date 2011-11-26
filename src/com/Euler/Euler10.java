package com.Euler;

import java.math.BigInteger;

public class Euler10 {

	// GOAL:
	// Find the sum of all the primes below 2 million

	BigInteger bigIntTwo = new BigInteger("2");
	BigInteger bigIntThree = new BigInteger("3");
	
	public Euler10() {
		
		System.out.println("Euler 10 START");
		
		BigInteger belowNumber = new BigInteger("2000000");
		BigInteger totalSum = new BigInteger("2");
		
		for (BigInteger a = bigIntThree; a.compareTo(belowNumber) == -1; a = a.add(bigIntTwo)) {
			
			// skip non-prime numbers
			if (!isPrimeBigInt(a)) continue;
			
			// increment the total sum by this prime
			totalSum = totalSum.add(a);
		}
		
		System.out.println("Total sum of prime numbers under " + belowNumber + " = " + totalSum);
		
		System.out.println("Euler 10 END");
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
