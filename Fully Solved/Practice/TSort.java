/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[] array = new int[T];
		for(int i=0; i<T; i++){
		    array[i]= scan.nextInt();
		}
		Arrays.sort(array);
		for(int i=0; i<T; i++){
		    System.out.println(array[i]);
	    }
	}
}
