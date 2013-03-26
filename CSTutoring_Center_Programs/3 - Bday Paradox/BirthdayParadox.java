/*
*  Program was designed to compute the approximate probability 
*	 that at least two have the same birthday in a room of 'n' people,
*  and display the answer on screen.  
*  Made for challenge 3 in CSTutoringCenter.com
*
*  --- CHALLENGE 3 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.*;
import java.lang.Math;

public class BirthdayParadox
{
public static void main(String[] args)
{
	System.out.println();
	System.out.println();
	System.out.println("[------  CSTutoringCenter.com Problem 3 (Bday Paradox) OWNER ------]");
	System.out.println();
	double numPeople;
	double probFinal = 1.0;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter number of people: ");
	numPeople = scan.nextDouble();
	System.out.println();
	System.out.println();
	
	for(double i = 1.0; i < numPeople; i++)
	{
		probFinal = (probFinal * (double)(1.0 - (i/365.0)));
	}
	double probPercent = 1.0 - probFinal;
	
	System.out.println("Out of: " + (int)numPeople + " people,");
	System.out.println("The probability that two people have the same birthday is: ");
	System.out.println(probPercent + " %");
	System.out.println();
	System.out.println("[----------------------- OWNED by dot_Cipher ----------------------]");
}
}