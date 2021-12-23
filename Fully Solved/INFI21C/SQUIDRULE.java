/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SQUIDRULE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int T = scan.nextInt();
    		for(int i=0; i<T; i++){
    		    int N = scan.nextInt();
                int[] Array = new int[N];
    		    for(int j=0; j<N; j++){
    		        Array[j]= scan.nextInt();
    		    }
                // for(int j=0; j<N; j++){
                //     System.out.println(Array[i]);
                // }
    		    int min = Array[0];
    		    for(int k=0; k<N; k++){
    		        if(min>=Array[k])
    		            min = Array[k];
    		    }
    		    int sum=0;
    		    for(int l=0; l<N; l++){
    		        sum = sum + Array[l];
    		    }
    		    int ans = sum - min;
    		    System.out.println(ans);
    		}
		}
		catch(Exception e){
		    return;
		}
	}
}