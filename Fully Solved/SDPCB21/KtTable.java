/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class KtTable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int T= scan.nextInt();
    		for(int j=1;j<=T;j++){
    		    int N = scan.nextInt();
                int count=0;
    		    int[] A = new int[N];
    		    int[] B = new int[N];
                for(int i=0; i<N; i++){
                    A[i]= scan.nextInt();
                }
                for(int i=0; i<N; i++){
                    B[i]= scan.nextInt();
                }
                for(int i=0; i<N; i++){
                    if(i==0){
                        if(A[i]>=B[i])
                            count++;
                    }
                    else if(i!=0){
                        if(A[i]-A[i-1]>=B[i])
                            count++;
                    }
                }
                System.out.println(count);
    		}
	    }
        catch(Exception e){
            return;
        }
	}
}
