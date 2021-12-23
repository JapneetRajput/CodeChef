/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TEMPLELA
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int S= scan.nextInt();
    		for(int j=1;j<=S;j++){
    		    int N = scan.nextInt();
    		    int[] Arr = new int[N];
    		    // for(int i=0,j=1; i<=(N-1)/2; i++,j++){
    		    //     Arr[i]=j;
    		    // }
		        // for(int i=(N+1)/2, j=(N-1)/2; i<N; i++,j--){
		        //     Arr[i]=j;
		        // }
                for(int i=0; i<N; i++){
                    Arr[i] = scan.nextInt();
                }
    		    if(N%2==0){
    		        System.out.println("no");
    		    }
    		    else{
    		        if(Arr[0]!=1){
    		        System.out.println("no");
    		        }
    		        else if(Arr[(N-1)/2]!=(N+1)/2){
    		            System.out.println("no");
    		        }
    		        else if(Arr[N-1]!=1){
    		            System.out.println("no");
    		        }
                    else{
                        System.out.println("yes");
                    }
    		    }
    		}
	    }
        catch(Exception e){
            return;
        }
	    
	}
}
