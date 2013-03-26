/*
*  Program was designed to calculate the given amount of prime numbers
*  Then display the sum of all the numbers calculated
*  Made for challenge 8 at CSTutoringCenter.com
*
*  --- CHALLENGE 8 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.*;
import java.lang.*;
import java.math.*;

public class PrimeNum1{
	
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
	System.out.println("[------  CSTutoringCenter.com Problem 8 (Prime Number 1) OWNER ------]");
	System.out.println();
	Scanner scan = new Scanner(System.in);
	long numSum = 0, numScan, numCount = 0;
	System.out.print("Please enter the desired number of primes to calculate: ");
	numScan = scan.nextLong();
	System.out.println();
	System.out.print("Prime Numbers are:  ");
	for (long i=2; i <= 10000; i++){
		if(isPrime(i)){
			System.out.print(i + "  ");
			numSum = numSum + i;
			numCount++;
		}
		if(numCount==numScan)
		break;
	}
	System.out.println();
	System.out.println();
	System.out.println("Sum of all primes listed: " + numSum);
	System.out.println();
	System.out.println("[-----------------------  OWNED by dot_Cipher  ----------------------]");
	}
}