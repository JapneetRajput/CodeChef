import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefFav
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
	    int T= scan.nextInt();
		while(T-->0){
		    int N = scan.nextInt();
		    String S = scan.next();
		    int R = S.indexOf("code");
		    int Q = S.indexOf("chef");
		    
		    if(R>Q){
		        System.out.println("WA");
		    }
		    else{
		        System.out.println("AC");
		    } 
		}
	}
}