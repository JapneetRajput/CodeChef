/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CryColor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
            int N = scan.nextInt();
            int r1 = scan.nextInt();
            int r2 = scan.nextInt();
            int r3 = scan.nextInt();
            int g1 = scan.nextInt();
            int g2 = scan.nextInt();
            int g3 = scan.nextInt();
            int b1 = scan.nextInt();
            int b2 = scan.nextInt();
            int b3 = scan.nextInt();
            int sum1 = r2+r3+g3;
            int sum2 = g1+b1+b2;
            if(sum1>=sum2)
                System.out.println(sum1);
            else
                System.out.println(sum2);
		}
	}
}
