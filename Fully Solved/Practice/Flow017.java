/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Flow017
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
		    int A=scan.nextInt();
		    int B=scan.nextInt();
		    int C=scan.nextInt();
		    if((A>B && A<C) || (A<B && A>C))
		        System.out.println(A);
		    if(B>A && B<C || B<A && B>C)
		        System.out.println(B);
		    if(C>B && C<A || C<B && C>A)
		        System.out.println(C);
		}
	}
}
