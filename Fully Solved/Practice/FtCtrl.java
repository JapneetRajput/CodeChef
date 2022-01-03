/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
public class FtCtrl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int T = scan.nextInt();
    		while(T-->0){
    		    int N = scan.nextInt();
    		    BigInteger ans = BigInteger.valueOf(1);
    		    for(int i=1; i<=N; i++){
    		        ans= ans.multiply(BigInteger.valueOf(i));
    		    }
    		    System.out.println(ans);
    		}
		}
		catch(Exception e){
		    return;
		}
	}
}
