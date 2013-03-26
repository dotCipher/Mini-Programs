//  Made for Problem 11 (Coordinate Planes) for www.cstutoringcenter.com
// @author dot_Cipher

import java.io.*;
import java.net.*;
import java.util.*;
import sun.net.www.http.HttpClient;
import javax.net.ssl.*; 
 
public class CoordsCheck {
	
	/*
	//  FOR REFERENCE
	public void bushSucks(String s, Hashtable h) {
		int index = s.indexOf(':');
		String letter = "" + s.charAt(index-1);
		int number = Integer.parseInt("" + s.charAt(index+1));
		h.put(letter, number);
		woot(s.substring(s.indexOf(')')) + 1, s.length(), h);
		}
		*/
		
		public static int QuadCheck(int num1, int num2){
			int quadChecker = 0;
			if(num1 != 0 && num2 != 0){
				if(num1 > 0){
					if(num2 > 0){
						quadChecker = 1;
					}
					else{
						quadChecker = 4;
					}
				}
				else{
					if(num2 > 0){
						quadChecker = 2;
					}
					else{
						quadChecker = 3;
					}
				}
			}
			return quadChecker;
		}
		
    public static void main(String[] args) throws Exception {
    	
    	// Construct data
    	String data = URLEncoder.encode("key1", "UTF-8") + "=" + URLEncoder.encode("value1", "UTF-8");
    	data += "&" + URLEncoder.encode("key2", "UTF-8") + "=" + URLEncoder.encode("value2", "UTF-8"); 
    		
	String inputLine, password; 
	System.out.println("[---------  CSTutoringCenter Problem 11 challenge  ---------}");
	System.out.println("Output String:  ");
	System.out.println();
	
	// Create a URL for the desired page 
	URL url = new URL("http://www.cstutoringcenter.com/problems/files/plane.txt"); 
	
	// Read all the text returned by the server 
	BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
	String str;
	
	int quad1Check = 0, quad2Check = 0, quad3Check = 0, quad4Check = 0;
	
	while ((str = in.readLine()) != null) {
		System.out.println(str + "  ");
		// str is one line of text; readLine() strips the newline character(s)
		
		String numCheck1Str = str.substring(0 , str.indexOf(','));
		String numCheck2Str = str.substring(str.indexOf(',')+1);
		
		int numCheck1 = Integer.parseInt(numCheck1Str);
		int numCheck2 = Integer.parseInt(numCheck2Str);
		
		int quadChecker = QuadCheck(numCheck1, numCheck2);
		if (quadChecker == 1){
			quad1Check++;
		}
		if (quadChecker == 2){
			quad2Check++;
		}
		if (quadChecker == 3){
			quad3Check++;
		}
		if (quadChecker == 4){
			quad4Check++;
		}
	} 		
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("Quad 1:" + quad1Check);    
		System.out.println("Quad 2:" + quad2Check);
		System.out.println("Quad 3:" + quad3Check);
		System.out.println("Quad 4:" + quad4Check);
	in.close(); 
	// END OF PROGRAM
	System.out.println();
	System.out.println("--------------------------------------------------------------");
	System.out.println();
	
    }
}
