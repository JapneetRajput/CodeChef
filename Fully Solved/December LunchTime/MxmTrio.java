/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MxmTrio {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			
			while(t-- > 0){
				int n = sc.nextInt();
				long[] arr = new long[n];

				for(int i=0;i<n;i++){
					arr[i] = sc.nextInt();
				}
				Arrays.sort(arr);
				System.out.println((arr[n-1] - arr[0]) * arr[n-2]);
			}
	}
}