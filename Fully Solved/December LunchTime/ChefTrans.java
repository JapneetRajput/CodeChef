/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefTrans
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner scan = new Scanner(System.in);
		    int T=scan.nextInt();
		    for(int i=0; i<T; i++){
		        int X = scan.nextInt();
		        int Y = scan.nextInt();
		        int Z = scan.nextInt();
		        if(X+Y>Z){
		            System.out.println("TRAIN");
		        }
		        else if(X+Y<Z){
		            System.out.println("PLANEBUS");
		        }
		        else if(X+Y==Z){
		            System.out.println("EQUAL");
		        }
		    }
		}
		catch(Exception e){
		    return;
		}
	}
}
public class ChefTrans {
    
}
