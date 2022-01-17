/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MinfD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
            int N = scan.nextInt();  
            int X = scan.nextInt();  
            Integer[] A = new Integer[N];
            for(int i=0; i<N; i++){
                A[i]=scan.nextInt();
            }
            Arrays.sort(A, Collections.reverseOrder());
            int sum=0, flag=1;
            for(int i=0; i<N; i++){
                sum = sum + A[i];
                if(sum>=X){
                    System.out.println(i+1);
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println("-1");
            }
		}
	}
}
