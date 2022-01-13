/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class GridXor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
            int N = scan.nextInt();
            // if(N%2==1){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    System.out.print("1 ");
                }
                System.out.println();
            }
            // }
            // else {
            //     for(int i=1; i<=N; i++){
            //         for(int j=1; j<=N; j++){
            //             if(j==i+1)
            //                 System.out.print("2 ");
            //             else if(i==N && j==1)
            //                 System.out.print("0 ");
            //             else
            //                 System.out.print("1 ");
            //         }
            //         System.out.println();
            //     }
            // }
		}
	}
}
