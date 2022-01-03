/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class LuckyFour
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T= scan.nextInt();
		while(T-->0){
		    int count=0;
		    String s = scan.next();
		    for(int i=0; i<s.length(); i++){
		        if(s.charAt(i)=='4')
		            count++;
		    }
		    System.out.println(count);
		}
	}
}
