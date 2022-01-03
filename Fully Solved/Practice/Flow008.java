/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Flow008
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
		    int N=scan.nextInt();
		    if(N<10)
	            System.out.println("Thanks for helping Chef!");
	        else
	            System.out.println("-1");
		}
	}
}
