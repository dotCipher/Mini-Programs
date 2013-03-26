/*
*  Program was designed to calculate the given amount of prime numbers
*  Then display the number of primes below a certain number
*  Made for challenge 9 at CSTutoringCenter.com
*
*  --- CHALLENGE 9 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class PrimeNum2{
	
	public static boolean isPrime (long num){
		boolean prime = true;
    long limit = (long)Math.sqrt (num);  
    for ( int i = 2; i <= limit; i++ ){
      if ( num % i == 0 ){
        prime = false;
        break;
      }
    }
    return prime;
	}
	
  public static void main(String[] args) {
  System.out.println();
	System.out.println("[------  CSTutoringCenter.com Problem 9 (Prime Number 2) OWNER ------]");
	System.out.println();
	
	Scanner scan = new Scanner(System.in);
	long numScan, numCount = 0;
	System.out.print("Please enter max number: ");
	
	numScan = scan.nextLong();
	System.out.println();
	
	BigInteger val1 = BigInteger.valueOf(numScan);
	
	while (val1.compareTo(numScan) > 0){
		if(isPrime(i)){
			numCount++;
		}
		if(numCount==numScan)
		break;
		val1.subtract(1);
	}
	
	System.out.println();
	System.out.println();
	System.out.println("Count of all primes below specific number: " + numCount);
	System.out.println();
	System.out.println("[-----------------------  OWNED by dot_Cipher  ----------------------]");
	}
}