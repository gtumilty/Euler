package com.Euler;

public class Euler4 {
	
	public Euler4()
	{
		// main program
	    
	    int highNum = 0;
	    int highFactor1 = 0;
	    int highFactor2 = 1;
	    
	    for (int a=100; a<1000; a++)
	    {
	        // is the total product of these numbers a palindrome?
	        for (int b=a; b>0; b--)
	        {
	            // find product and convert to string
	            int newProduct = a*b;
	            
	            //System.out.println(a + " x " + b + " = " + newProduct);
	            
	            String newString = String.valueOf(newProduct);
	            
	            // get even string size (decrement if odd)
	            int stringSize = convertIntToEven(newString.length());
	            String firstHalf = newString.substring(0,stringSize/2);
	            String lastHalf = newString.substring(stringSize-(stringSize/2),stringSize);
	            //System.out.println("ORIG lastHalf: " + lastHalf);
	            lastHalf = reverseString(lastHalf);
	            
	            //System.out.println("1st: " + firstHalf + " - Last: " + lastHalf);
	            // 
	            if (firstHalf.equals(lastHalf))
	            {
	               if (highNum < newProduct) {
	                  highNum = newProduct;
	                  highFactor1 = a;
	                  highFactor2 = b;
	                  System.out.println("== NEW HIGH NUM: " + newProduct + " ==");	                  
	               }
	            }
	        }
	    }
	    
	    System.out.println("Highest palindrome of 2 3-digit numbers = " + highNum);
	    System.out.println("Factors: " + highFactor1 + " & " + highFactor2);
	}
	
	// convert an odd integer to an even number by subtracting one
	static int convertIntToEven(int number)
	{
		
	    if (number % 2 == 0) return number;
	    else return number-1;
	}

	// reverse a string
	//string reverseString(string in_string)
	//{
	static String reverseString(String in_string)
	{
		String returnString = "";
		int size = in_string.length();
				
		//return returnString;
		returnString = (new StringBuffer(in_string).reverse()).toString();
		return returnString;
	}
}
