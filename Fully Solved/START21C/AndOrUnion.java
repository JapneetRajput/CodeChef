/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class AndOrUnion
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int T = scan.nextInt();
    		while(T-->0){
    		    int N = scan.nextInt();
    		    int[] A = new int[N];
    		  //  int c = (N*(N-1)/2);
    		    int[] B = new int[(N*(N-1)/2)];
    		    for(int i=0; i<N; i++){
    		        A[i]=scan.nextInt();
    		    }
    		    for(int i=0; i<N; i++){
    		        for(int j=i+1; j<N; j++){
    		            B[j-1+i]= A[i]&A[j];
    		        }
    		    }
    		    Arrays.sort(B);
    		    for(int i=0; i<(N*(N-1)/2)-1; i++){
    		        B[(N*(N-1)/2)-1]=B[(N*(N-1)/2)-1]|B[i];
    		    }
    		    System.out.println(B[(N*(N-1)/2)-1]);
		    }
		}
		catch(Exception e){
		    return;
		}
	}
}
