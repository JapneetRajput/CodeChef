/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Flow006
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int T = scan.nextInt();
    		int sum=0;
    		for(int i=0; i<T; i++){
        		int N = scan.nextInt();
            	sum = 0;
        		do{
            		sum = sum + N%10;
            		N=N/10;
        		}while(N!=0);
        		System.out.println(sum);
    		}
		}
		catch(Exception e){
		    return;
		}
	}
}
