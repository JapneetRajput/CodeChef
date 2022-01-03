/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Flow004
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
		    String num = scan.next();
		    String a = num.charAt(0) +"";
		    String b = num.charAt(num.length()-1) +"";
		    System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
		}
	}
}
