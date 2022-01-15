/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SumParity
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
            int N = scan.nextInt();   
            int A = scan.nextInt();
            if(N==1){
                if(A%2==0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }
            else if(A%2==0){
                System.out.println("Impossible");
            }
            else{
                if(N%2==0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }
		}
	}
}
