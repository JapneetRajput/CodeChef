/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CovidTheatre
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
		    int N = scan.nextInt();
		    int M = scan.nextInt();
		    if(M%2==0){
		        M= M/2;
		    }
		    else{
		        M=M/2 +1;
		    }
		    if(N%2==0){
		        N=N/2;
		    }
		    else{
		        N=N/2 +1;
		    }
		    System.out.println(M*N);
		}
	}
}
