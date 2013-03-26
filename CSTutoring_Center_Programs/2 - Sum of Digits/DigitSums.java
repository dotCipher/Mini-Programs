/*
*  Program was designed to count the digits of any number raised by 2
*  (2^x) and display the sum of them on screen.  Made for challenge 2 in
*  CSTutoringCenter.com
*
*  --- CHALLENGE 2 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.*;
import java.lang.Math;

public class DigitSums
{
public static void main(String[] args)
{
	System.out.println();
	System.out.println("[------  CSTutoringCenter.com Problem 2 (Sum of Digits) OWNER ------]");
	Scanner scan = new Scanner(System.in);
	long inputPower, inputCalc;
	
	System.out.println();
	System.out.print("Enter number (2^x):");
	
	inputPower = scan.nextLong();
	inputCalc = (long)Math.pow(2, inputPower);
	String inputNum = Long.toString(inputCalc);
	
	String [] inputCount = new String[inputNum.length()];
	long outputSum = 0;
	System.out.println();
	System.out.print("The Digits of the number are: ");
	
	for (int count = 0; count < inputNum.length(); count++)
	{
		inputCount[count] = inputNum.substring(count,count+1);
		System.out.print(inputCount[count]);
		System.out.print(" ");
		outputSum = outputSum + Long.parseLong(inputCount[count]);
	}
	System.out.println("\n");
	System.out.print("The sum of the digits is: ");
	System.out.println(outputSum);
	System.out.println("[-----------------------  OWNED by dot_Cipher  ----------------------]");

}
}