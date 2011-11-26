package com.Euler;

// UPDATE 26/11/2011 - testing from square root of number downwards instead of *0.5

import java.math.BigInteger;

public class Euler3 {
	
	// GOAL:
	// Find the largest prime factor of a composite number. (600851475143)
	
	// test data - 13195 should have prime factors 5, 7, 13, and 29
	//BigInteger checkNum = new BigInteger("13195");
	BigInteger checkNum = new BigInteger("600851475143");
	BigInteger bigIntThree = new BigInteger("3");
	BigInteger bigIntTwo = new BigInteger("2");
	
	public Euler3() {
		
		System.out.println("Euler 3 START");
		
		// determine starting point - square root of starting number
		BigInteger startingBigInt = sqrt(checkNum);

		// if starting number is even, decrement it to make it odd
		if (startingBigInt.mod(bigIntTwo).compareTo(BigInteger.ZERO) == 0)
			startingBigInt = startingBigInt.subtract(BigInteger.ONE);
		
		// find factors of checknum
		for (BigInteger a = startingBigInt; a.compareTo(bigIntTwo) == 1; a = a.subtract(bigIntTwo)) {
			
			System.out.print(a);

			// is this a prime number?
			if (checkNum.mod(a).compareTo(BigInteger.ZERO) == 0) {
				System.out.print(" factor");
				// is this a factor?
				if (isPrimeBigInt(a)) {
					// prime factor found!
					System.out.println("\nPrime factor found! It's " + a.toString() + "!");
					break;
				}
			}
			
			System.out.print("\n");
		}
		
		System.out.println("Euler 3 END");
	}

	//checks whether an BigInteger is prime or not.
	boolean isPrimeBigInt(BigInteger n) {

	    // check the odd numbers
	    for(BigInteger i = bigIntThree; (i.multiply(i)).compareTo(n) < 1; i = i.add(bigIntTwo)) {
	    	//System.out.println(i.toString());
	        if(n.mod(i).compareTo(BigInteger.ZERO) == 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}

	// find the square root of a BigInteger
	BigInteger sqrt(BigInteger n) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		while(b.compareTo(a) >= 0) {
			BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
			if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
			else a = mid.add(BigInteger.ONE);
		}
		return a.subtract(BigInteger.ONE);
	}
}
