/*
*  Program was designed to calculate the exponential function:
*  f(x) = (4^x + x^3 + x^2 + x - 2^x) / 3^x
*  Then display the answer of the function call.
*  Made for challenge 6 at CSTutoringCenter.com
*
*  --- CHALLENGE 7 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.*;
import java.lang.*;
import java.math.*;
 
public class ExponentialFunction {
	
	public static BigInteger power(BigInteger b,BigInteger e){
		BigInteger pow=BigInteger.ONE;   
		int lastBit=e.bitLength()-1;
		if(lastBit>0){
			for(int i=0;i<lastBit;i++){
				if(e.testBit(i))    pow = pow.multiply(b);	
				b = b.multiply(b);
			}
			pow = pow.multiply(b);
		}
		return pow;		
	}

	public static void main(String[] args){
		System.out.println();
		System.out.println("[------  CSTutoringCenter.com Problem 7 (Exponential Function) OWNER ------]");
		Scanner scan = new Scanner(System.in);
	
		System.out.println();
		System.out.println("f(x) = (4^x + x^3 + x^2 + x - 2^x) / 3^x");
		System.out.print("Enter x of f(x):  ");	
		
		// entry
		long longX = scan.nextLong();
		System.out.println();
		BigInteger x = BigInteger.valueOf(longX);
		
		// Function call for x
		// f(x) = (4^x + x^3 + x^2 + x - 2^x) / 3^x
		BigInteger val2 = BigInteger.valueOf(2);
		BigInteger val3 = BigInteger.valueOf(3);
		BigInteger val4 = BigInteger.valueOf(4);
		
		BigInteger pow1 = power(val4, x);
		BigInteger pow2 = power(x, val3);
		BigInteger pow3 = power(x, val2);
		BigInteger pow4 = power(val2, x);
		BigInteger pow5 = power(val3, x);
		
		BigInteger compound1 = pow1.add(pow2);
		BigInteger compound2 = pow3.add(x);
		BigInteger compound3 = compound1.add(compound2);
		BigInteger compound4 = compound3.subtract(pow4);
		BigInteger compound5 = compound4.divide(pow5);
		// END FUNCTION
		
		//print ans
		System.out.println("(4^" + longX + 
			" + " + longX + "^3 + " + longX + 
			"^2 + " + longX + " - 2^" + longX + 
			") / 3^" + longX);
		System.out.print("Function call of f(x) for F(" + longX + ") is = ");
		System.out.print(compound5);
		
		//exit
		System.out.println();
		System.out.println();
		System.out.println("[-----------------------  OWNED by dot_Cipher  ---------------------]");
	}
}
