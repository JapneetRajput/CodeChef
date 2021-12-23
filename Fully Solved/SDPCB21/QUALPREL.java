/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class QUALPREL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int T = scan.nextInt();
    		while(T-->0){
    		    int N = scan.nextInt();
    		    Integer[] Arr = new Integer[N];
    		    int K = scan.nextInt();
    		    int count=0;
    		    for(int i=0; i<N; i++){
    		        Arr[i]=scan.nextInt();
    		    }
    		    Arrays.sort(Arr,Collections.reverseOrder());
    		    int temp=Arr[K-1];
    		    for(int i=0; i<N; i++){
    		        if(Arr[i]>=temp)
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
