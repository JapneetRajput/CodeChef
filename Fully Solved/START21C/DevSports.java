/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class DevSports
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
		    int Z = scan.nextInt();
		    int Y = scan.nextInt();
		    int A = scan.nextInt();
		    int B = scan.nextInt();
		    int C = scan.nextInt();
		    if(Z - (Y+A+B+C)>=0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
