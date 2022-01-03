/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Flow007
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T= scan.nextInt();
		while(T-->0){
		    int count=0;
		    String s = scan.next();
		    String ans = "";
		    for(int i=s.length()-1; i>=0; i--){
		        ans = ans + s.charAt(i);
		    }
	        int j = Integer.parseInt(ans);
	        System.out.println(j);
		}
	}
}
