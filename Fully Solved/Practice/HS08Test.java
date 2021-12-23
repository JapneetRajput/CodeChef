/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class HS08Test
{
	public static void main (String[] args)
	{
	    try{
    		// your code goes here
    		Scanner s = new Scanner(System.in);
    		int withdraw_amount=s.nextInt();
    		double balance=s.nextDouble();
    		if(withdraw_amount<=(balance -0.5)&&withdraw_amount%5==0){
    		    balance = balance -withdraw_amount-0.5;
    		}
    		else{
    		    balance=balance;
    		}
    		System.out.printf("%.2f",balance);
	    }
	    catch(Exception e){
	        return;
	    }
		
	}
}