/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class KLXor
{
	public static void main (java.lang.String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T= scan.nextInt();
		while(T-->0){
		    int N = scan.nextInt();
		    int K = scan.nextInt(), count =0;
            String S = scan.next();
            String T1 = S.substring(0,K);
            String T2 = "";
            String T3 = "";
		    for(int i=0; i<N-K; i++){
		        if(i!=0)
                    T1 = T3;
                T3="";
		        T2 = S.substring(i+1,i+K+1);
                for(int j=0; j<K; j++){
                    if(T1.charAt(j)==T2.charAt(j))
                        T3= T3 + "0";
                    else 
                        T3= T3 + "1";
                }
            }
            if(N==K){
                T3=S;
            }
            for(int j=0; j<K; j++){
                if(T3.charAt(j)=='1')
                    count++;
            }
            System.out.println(count);
		}
	}
}
