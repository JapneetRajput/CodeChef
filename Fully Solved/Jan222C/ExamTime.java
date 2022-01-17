/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ExamTime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T-->0){
            int dsa1 = scan.nextInt();   
            int toc1 = scan.nextInt();  
            int dm1 = scan.nextInt();  
            int dsa2 = scan.nextInt();   
            int toc2 = scan.nextInt();  
            int dm2 = scan.nextInt(); 
            if(dsa1+toc1+dm1>dsa2+toc2+dm2){
                System.out.println("Dragon");
            }
            else if(dsa1+toc1+dm1<dsa2+toc2+dm2){
                System.out.println("Sloth");
            }
            else if(dsa1+toc1+dm1==dsa2+toc2+dm2){
                if(dsa1>dsa2){
                    System.out.println("Dragon");
                }
                else if(dsa1<dsa2){
                    System.out.println("Sloth");
                }
                else if(toc1>toc2){
                    System.out.println("Dragon");
                }
                else if(toc1<toc2){
                    System.out.println("Sloth");
                }
                else if(dm1>dm2){
                    System.out.println("Dragon");
                }
                else if(dm1<dm2){
                    System.out.println("Sloth");
                }
                else{
                    System.out.println("Tie");
                }
            }
		}
	}
}
