/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Popcorn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
            int A = scan.nextInt() + scan.nextInt();   
            int B = scan.nextInt() + scan.nextInt();   
            int C = scan.nextInt() + scan.nextInt();
            int ans =0;
            if(A>=B&&A>=C)
                ans = A;
            else if(B>=A&&B>=C)
                ans = B;
            else if(C>=B&&C>=A)
                ans = C;
            System.out.println(ans);
		}
	}
}
