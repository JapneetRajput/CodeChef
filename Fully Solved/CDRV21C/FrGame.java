/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class FrGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
		    int T= scan.nextInt();
    		while(T-->0){
    		    int A = scan.nextInt();
    		    int B = scan.nextInt();
    		    int C = scan.nextInt();
    		    int D = scan.nextInt();
    		    if(A>=B){
    		        B= B+C;
    		    }
    		    else{
    		        A = A + C;
    		    }
    		    if(A>=B){
    		        B= B+D;
    		    }
    		    else{
    		        A = A + D;
    		    }
    		    if(A>=B){
    		        System.out.println("N");
    		    }
    		    else{
    		        System.out.println("S");
    		    }
    		    
    		}
		}
		catch(Exception e){
		    return;
		}
	}
}
