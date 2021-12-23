/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class DOLL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int T = scan.nextInt();
    		for(int i=0; i<T; i++){
    		    int count=0;
    		    int N = scan.nextInt();
    		    int K = scan.nextInt();
    		    int[] Array = new int[N];
    		    for(int j=0; j<N; j++){
    		        Array[j]=scan.nextInt();
    		    }
    		    for(int k=0;k<N;k++){
    		        if(Array[k]>K)
    		            count++;
    		    }
    		    System.out.println(count);
    		}
		}
		catch(Exception e){
		    return;
		}
	}
}
