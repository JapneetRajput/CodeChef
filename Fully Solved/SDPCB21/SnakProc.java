/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SnakProc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		try{
    		int R= scan.nextInt();
    		for(int j=1;j<=R;j++){
                int L = scan.nextInt();
                String S = scan.next();
                int H = 0, T = 1, F=1;
                // char[] c = new char[L];
                // for(int i=1; i<L-1; i++){
                //     c[i]=S.charAt(i);
                // }
                for(int i=0; i<L; i++){
                    if(S.charAt(i)=='.')
                        continue;
                    else if(S.charAt(i)=='H'){
                        if(T==0){
                            // F=0;
                            if(H==0){
                                T=1;
                                H=0;
                            }
                            else if(H==1){
                                T=0;
                                H=1;
                            }
                                break;
                        }
                        else if(T==1){
                            // F=1;
                            H=1;
                            T=0;
                        }
                    }
                    else if(S.charAt(i)=='T'){
                        if(H==0){
                            // F=0;
                            if(T==0){
                                T=1;
                                H=0;
                            }
                            else if(T==1){
                                T=0;
                                H=1;
                            }
                                break;
                        }
                        else if(H==1){
                            // F=1;
                            T=1;
                            H=0;
                        }
                    }
                }
                if(H==0)
                    System.out.println("Valid");
                else if(T==0)
                    System.out.println("Invalid");
            }
	    }
        catch(Exception e){
            System.out.println(e);
            return;
        }
	}
}
