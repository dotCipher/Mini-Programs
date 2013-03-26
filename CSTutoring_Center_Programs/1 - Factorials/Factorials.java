/*
*  Program was designed to produce a set number of factorials 
*  and display the sum of them on screen.  Made for challenge 1 in
*  CSTutoringCenter.com
*
*  --- CHALLENGE 1 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.Scanner;

public class Factorials
{
public static long factorial( int n )		// Evaluates n!
{
  if( n <= 1 )     // base case
  return 1;
  else
  return n * factorial( n - 1 );
}
public static void main (String[] args)
{
	System.out.println();
	System.out.println("[------  CSTutoringCenter.com Problem 1 (Factorials) OWNER ------]");
	int factNum, i = 1;
	long factSum = 0;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter # of factorials to calculate sum of (EXCLUDES 0):  ");	
	factNum = scan.nextInt();
  for(; i <= factNum; i++ )
  {
  	System.out.println( i + "! = " + factorial( i ) );
  	factSum = (factSum + (factorial(i)));
  	if (i == factNum)
  	{
  		System.out.println("Sum of all factorials = " + factSum);
  	}
	}
	System.out.println("[---------------------  OWNED by dot_Cipher  --------------------]");

}
}