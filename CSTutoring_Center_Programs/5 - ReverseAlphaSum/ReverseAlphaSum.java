/*
*  Program was designed to compute the sum of all characters in any
*  specified string referancing thier values to the reversed alphabet
*  Results of the string inputted will be displayed on screen.
*	 
*  Made for challenge 5 in CSTutoringCenter.com
*
*  --- CHALLENGE 5 PROGRAM ---
*  @author dot_Cipher
*/

import java.util.*;
import java.lang.*;

public class ReverseAlphaSum
{
public static void main(String[] args)
{
	System.out.println();System.out.println();
	System.out.println("[------  CSTutoringCenter.com Problem 5 (ReverseAlphaSum) OWNER ------]");
	System.out.println();
	
	Scanner scan = new Scanner(System.in);
	String inputString;
	long stringValue = 0;
	
	System.out.print("Enter string to calculate numbers for: ");
	inputString = scan.nextLine();
	System.out.println();
	char [] charArray = inputString.toCharArray();
	
	System.out.println();
	System.out.println("Character values returned from string input: ");
	
	for (int i = 0; i < charArray.length; i++)
	{
		if(charArray[i] == 'a'|| charArray[i] == 'A')
		{
			stringValue = stringValue + 26;
			System.out.print("26 ");
		}
		else if(charArray[i] == 'b'|| charArray[i] == 'B')
		{
			stringValue = stringValue + 25;
			System.out.print("25 ");
		}
		else if(charArray[i] == 'c'|| charArray[i] == 'C')
		{
			stringValue = stringValue + 24;
			System.out.print("24 ");
		}
		else if(charArray[i] == 'd'|| charArray[i] == 'D')
		{
			stringValue = stringValue + 23;
			System.out.print("23 ");
		}
		else if(charArray[i] == 'e'|| charArray[i] == 'E')
		{
			stringValue = stringValue + 22;
			System.out.print("22 ");
		}		
		else if(charArray[i] == 'f'|| charArray[i] == 'F')
		{
			stringValue = stringValue + 21;
			System.out.print("21 ");
		}
		else if(charArray[i] == 'g'|| charArray[i] == 'G')
		{
			stringValue = stringValue + 20;
			System.out.print("20 ");
		}
		else if(charArray[i] == 'h'|| charArray[i] == 'H')
		{
			stringValue = stringValue + 19;
			System.out.print("19 ");
		}
		else if(charArray[i] == 'i'|| charArray[i] == 'I')
		{
			stringValue = stringValue + 18;
			System.out.print("18 ");
		}
		else if(charArray[i] == 'j'|| charArray[i] == 'J')
		{
			stringValue = stringValue + 17;
			System.out.print("17 ");
		}
		else if(charArray[i] == 'k'|| charArray[i] == 'K')
		{
			stringValue = stringValue + 16;
			System.out.print("16 ");
		}
		else if(charArray[i] == 'l'|| charArray[i] == 'L')
		{
			stringValue = stringValue + 15;
			System.out.print("15 ");
		}
		else if(charArray[i] == 'm'|| charArray[i] == 'M')
		{
			stringValue = stringValue + 14;
			System.out.print("14 ");
		}
		else if(charArray[i] == 'n'|| charArray[i] == 'N')
		{
			stringValue = stringValue + 13;
			System.out.print("13 ");
		}
		else if(charArray[i] == 'o'|| charArray[i] == 'o')
		{
			stringValue = stringValue + 12;
			System.out.print("12 ");
		}
		else if(charArray[i] == 'p'|| charArray[i] == 'P')
		{
			stringValue = stringValue + 11;
			System.out.print("11 ");
		}
		else if(charArray[i] == 'q'|| charArray[i] == 'Q')
		{
			stringValue = stringValue + 10;
			System.out.print("10 ");
		}
		else if(charArray[i] == 'r'|| charArray[i] == 'R')
		{
			stringValue = stringValue + 9;
			System.out.print("9 ");
		}
		else if(charArray[i] == 's'|| charArray[i] == 'S')
		{
			stringValue = stringValue + 8;
			System.out.print("8 ");
		}
		else if(charArray[i] == 't'|| charArray[i] == 'T')
		{
			stringValue = stringValue + 7;
			System.out.print("7 ");
		}
		else if(charArray[i] == 'u'|| charArray[i] == 'U')
		{
			stringValue = stringValue + 6;
			System.out.print("6 ");
		}
		else if(charArray[i] == 'v'|| charArray[i] == 'V')
		{
			stringValue = stringValue + 5;
			System.out.print("5 ");
		}
		else if(charArray[i] == 'w'|| charArray[i] == 'W')
		{
			stringValue = stringValue + 4;
			System.out.print("4 ");
		}
		else if(charArray[i] == 'x'|| charArray[i] == 'X')
		{
			stringValue = stringValue + 3;
			System.out.print("3 ");
		}
		else if(charArray[i] == 'y'|| charArray[i] == 'Y')
		{
			stringValue = stringValue + 2;
			System.out.print("2 ");
		}
		else if(charArray[i] == 'z'|| charArray[i] == 'z')
		{
			stringValue = stringValue + 1;
			System.out.print("1 ");
		}
		else
		{
			System.out.print("  ");
		}
		
	}
	System.out.println();
	System.out.print("Sum total result = " + stringValue);
	
	System.out.println();
	System.out.println("[------------------------ OWNED by dot_Cipher ------------------------]");
	System.out.println();
}
}