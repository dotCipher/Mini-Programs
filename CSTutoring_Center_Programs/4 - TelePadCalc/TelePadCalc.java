/*
*  Program was designed to compute the product of all characters in any
*  specified string referancing thier values to the US telephone touchtone
*  keypad system.  Results of the string inputted will be displayed
*  on screen.
*	 
*  Made for challenge 4 in CSTutoringCenter.com
*
*  --- CHALLENGE 4 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.*;
import java.lang.*;

public class TelePadCalc
{
public static void main(String[] args)
{
	System.out.println();System.out.println();
	System.out.println("[------  CSTutoringCenter.com Problem 4 (TelePadCalc) OWNER ------]");
	System.out.println();
	
	Scanner scan = new Scanner(System.in);
	String inputString;
	long stringValue = 1;
	
	System.out.print("Enter string to calculate numbers for: ");
	inputString = scan.nextLine();
	System.out.println();
	char [] charArray = inputString.toCharArray();
	
	System.out.println();
	System.out.println("Character values returned from string input: ");
	
	for (int i = 0; i < charArray.length; i++)
	{
		if(charArray[i] == 'a'|| charArray[i] == 'A' || charArray[i] == 'b' || charArray[i] == 'B' || charArray[i] == 'c' || charArray[i] == 'C')
		{
			stringValue = stringValue * 2;
			System.out.print("2");
		}
		else if(charArray[i] == 'd'|| charArray[i] == 'D' || charArray[i] == 'e' || charArray[i] == 'E' || charArray[i] == 'f' || charArray[i] == 'F')
		{
			stringValue = stringValue * 3;
			System.out.print("3");
		}
		else if(charArray[i] == 'g' || charArray[i] == 'G' || charArray[i] == 'h' || charArray[i] == 'H' || charArray[i] == 'i' || charArray[i] == 'I')
		{
			stringValue = stringValue * 4;
			System.out.print("4");
		}
		else if(charArray[i] == 'j'|| charArray[i] == 'J' || charArray[i] == 'k' || charArray[i] == 'K' || charArray[i] == 'l' || charArray[i] == 'L')
		{
			stringValue = stringValue * 5;
			System.out.print("5");
		}
		else if(charArray[i] == 'm'|| charArray[i] == 'M' || charArray[i] == 'n' || charArray[i] == 'N' || charArray[i] == 'o' || charArray[i] == 'O')
		{
			stringValue = stringValue * 6;
			System.out.print("6");
		}
		else if(charArray[i] == 'p'|| charArray[i] == 'P' || charArray[i] == 'q' || charArray[i] == 'Q' || charArray[i] == 'r' || charArray[i] == 'R' || charArray[i] == 's' || charArray[i] == 'S')
		{
			stringValue = stringValue * 7;
			System.out.print("7");
		}
		else if(charArray[i] == 't'|| charArray[i] == 'T' || charArray[i] == 'u' || charArray[i] == 'U' || charArray[i] == 'v' || charArray[i] == 'V')
		{
			stringValue = stringValue * 8;
			System.out.print("8");
		}
		else if(charArray[i] == 'w'|| charArray[i] == 'W' || charArray[i] == 'x' || charArray[i] == 'X' || charArray[i] == 'y' || charArray[i] == 'Y' || charArray[i] == 'z' || charArray[i] == 'Z')
		{
			stringValue = stringValue * 9;
			System.out.print("9");
		}
		else
		{
			System.out.print(" ");
		}
		
	}
	System.out.println();
	System.out.print("Product total result = " + stringValue);
	
	System.out.println();
	System.out.println("[----------------------- OWNED by dot_Cipher -----------------------]");
	System.out.println();
}
}