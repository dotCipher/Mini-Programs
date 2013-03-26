//  Made for Problem 15 (Random Dice Throws) for www.cstutoringcenter.com
// @author dot_Cipher

import java.io.*;
import java.net.*;
import java.util.*;
import sun.net.www.http.HttpClient;
import javax.net.ssl.*; 

public class RandomDiceThrows{
	public static void main(String[] args) throws Exception{
		// Construct data
    String data = URLEncoder.encode("key1", "UTF-8") + "=" + URLEncoder.encode("value1", "UTF-8");
   	data += "&" + URLEncoder.encode("key2", "UTF-8") + "=" + URLEncoder.encode("value2", "UTF-8"); 
   	
    String inputLine, password; 
		System.out.println("[---------  CSTutoringCenter Problem 15 challenge  ---------}");
		System.out.println("Output Rolls:  ");
		System.out.println();
	
		// Create a URL for the desired page 
		URL url = new URL("http://www.cstutoringcenter.com/problems/files/dice.txt"); 
	
		// Read all the text returned by the server 
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String str;
		
		int doubles = 0;
		
		while ((str = in.readLine()) != null) {
			System.out.print(str + "|--|");
			// str is one line of text; readLine() strips the newline character(s)
			
			String roll1str = str.substring(0, 1);
			String roll2str = str.substring(2, 3);
			
			int roll1 = Integer.parseInt(roll1str);
			int roll2 = Integer.parseInt(roll2str);
			
			if(roll1 == roll2) 
			doubles++;
			
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("Doubles = " + doubles);
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println();
	}
}