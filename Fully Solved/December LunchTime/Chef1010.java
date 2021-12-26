import java.util.*;
import java.lang.*;
import java.io.*;

// package codechef; // don't place package name! */
/* Name of the class has to be "Main" only if the class is public. */
public class Chef1010
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
    		for(int i=0; i<T; i++){
    		    int N= scan.nextInt();
    		    String S = scan.next();
    		    int count1=0,count0=0;
    		    for(int j=0; j<N; j++){
    		        if(S.charAt(j)=='0')
    		            count0++;
    		        if(S.charAt(j)=='1')
    		            count1++;
    		    }
    		    int count = Math.min(count0,count1);
    		    System.out.println(Math.max(0,count-1));
    		}
        scan.close();
		} 
		catch(Exception e){
		    return;
		}
	}
}
