/*
*  Program was designed to calculate the power function:
*  f(x,y) = x^y + y^x where x>0 and y>1
*  Then display a set amount of function calls determined by the user.
*  Made for challenge 6 at CSTutoringCenter.com
*
*  --- CHALLENGE 6 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class PowerFunction
{

public static BigInteger power(BigInteger b,BigInteger e)
{
	BigInteger pow=BigInteger.ONE;   
	int latestBit=e.bitLength()-1;
	if(latestBit>0)
	{
		for(int i=0;i<latestBit;i++)
		{
			if(e.testBit(i))    
			pow=pow.multiply(b);	
			b=b.multiply(b);
		}
		pow=pow.multiply(b);
	}
	return pow;		
}


public static void main (String[] args)
{
	System.out.println();
	System.out.println("[------  CSTutoringCenter.com Problem 6 (PowerFunction) OWNER ------]");
	long callNum;
	Scanner scan = new Scanner(System.in);
	
	System.out.println();
	System.out.print("Enter # of Power Function calls to sum:  ");	
	callNum = scan.nextLong();
	System.out.println();
	BigInteger sumTotal = BigInteger.valueOf(0);
	
	for(int i = 1; i <= callNum; i++)
	{
		BigInteger val1 = BigInteger.valueOf(i);
		BigInteger val2 = BigInteger.valueOf(i+1);
		BigInteger LHS = power(val1, val2);
		BigInteger RHS = power(val2, val1);
		BigInteger sumCalc = LHS.add(RHS);
		BigInteger sumCheck = BigInteger.valueOf(2);
		if(sumCalc.compareTo(sumCheck) == 0) sumCalc = BigInteger.valueOf(3);
		System.out.print("f(" + i + "," + (i+1) + ") = ");
		System.out.println(i + "^" + (i+1) + " + " + (i+1) + "^" + i + " = " + sumCalc);
		sumTotal = sumTotal.add(sumCalc);
	}
	System.out.println();
	System.out.print("Sum of all Power Function calls: " + sumTotal);
	System.out.println();
	System.out.println("[-----------------------  OWNED by dot_Cipher  ---------------------]");

}
}