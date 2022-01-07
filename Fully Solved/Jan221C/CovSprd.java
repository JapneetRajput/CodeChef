/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CovSprd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		while(T-->0){
		    long N = scan.nextLong();
		    long D = scan.nextLong();
		    long ans = 1;
		    if(D<=10){
		        ans=(long) Math.pow(2,D);
		        if(ans>N)
		            System.out.println(N);
		        else
		            System.out.println(ans);
		    }
            else{
                ans =(long) (Math.pow(3,D-10))*1024;
		        if(ans>N)
		            System.out.println(N);
		        else
                    System.out.println(ans);
            }
		}
	}
}
