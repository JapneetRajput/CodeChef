/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class PinBS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
		    String S = scan.next();
		    int a =0;
		    for(int i=0; i<S.length()-1;i++){
		        if((S.charAt(i)=='1' && S.charAt(i+1)=='0') || (S.charAt(i)=='1' && S.charAt(i+1)=='1')){
		          //  System.out.println("Yes");
		          a=1;
		            break;
		        }
		    }
		    if(a==0){
		        System.out.println("No");
		    }
		    else if(a==1){
		        System.out.println("Yes");
		    }
		}
	}
}
