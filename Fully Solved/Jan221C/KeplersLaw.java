/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class KeplersLaw
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
		    int T1=scan.nextInt();
		    int T2=scan.nextInt();
		    int R1=scan.nextInt();
		    int R2=scan.nextInt();
		    if(Math.pow(T1*R2,2)*R2 == Math.pow(T2*R1,2)*R1){
		        System.out.println("Yes");
		    }
		    else
		        System.out.println("No");
		}
	}
}
