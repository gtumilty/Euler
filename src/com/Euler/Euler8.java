package com.Euler;

import java.math.BigInteger;

public class Euler8 {

	// GOAL:
	// Find the greatest product of five consecutive digits in the 1000-digit number.
	
	public Euler8() {
		
		System.out.println("Euler 8 START");
		
		// how many consecutive numbers to multiply
		BigInteger productDigits = new BigInteger("5");
		
		// 1000-digit number stored as string
		String number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		
		// get length of number and subtract amount of consecutive numbers to multiply to get loop length
		BigInteger numLen = new BigInteger("" + number.length());
		BigInteger loopLength = numLen.subtract(productDigits);
		
		// record highest number
		BigInteger highNum = BigInteger.ZERO;
		
		// find highest product in 1000-digit number
		for (BigInteger a=BigInteger.ZERO; a.compareTo(loopLength) < 1; a = a.add(BigInteger.ONE))
		{
			// get first digit of total product via substring
			BigInteger product = new BigInteger(number.substring(a.intValue(),a.intValue()+1));
			
			System.out.print(product.toString());
			
			// multiply 5 consecutive numbers together
			for (BigInteger b = a.add(BigInteger.ONE); b.compareTo(a.add(productDigits)) == -1; b = b.add(BigInteger.ONE))
			{
				BigInteger newMult = new BigInteger(number.substring(b.intValue(),b.intValue()+1));
				System.out.print(" * " + newMult);
				product = product.multiply(newMult);
			}
			
			System.out.print(" = " + product + "\n");
			
			// if this is the highest product, record it
			if (product.compareTo(highNum) == 1)
			{
				System.out.println("NEW HIGH NUM = " + product);
				highNum = product;
			}
		}

		System.out.println("Highest product of 5 consecutive numbers is " + highNum.toString());
		System.out.println("Euler 8 END");
	}
}
