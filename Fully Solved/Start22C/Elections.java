/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Elections
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();   
            if(A>50){
                System.out.println("A");
            }
            else if(B>50){
                System.out.println("B");
            }
            else if(C>50){
                System.out.println("C");
            }
            else{
                System.out.println("NOTA");
            }
		}
	}
}
