import java.util.*;

public class Typing {
    public static void main(java.lang.String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            int T = scan.nextInt();
            for(int j=0; j<T; j++){
                int N = scan.nextInt();
                HashMap<String,Integer> h = new HashMap<String,Integer>();
                int n1= 0;
                // java.lang.String[] s = new java.lang.String[N];
                // for(int z=0; z<s.length;z++){
                //     s[z]="";
                // }
                // int[] time = new int[N];
                for(int k=0; k<N; k++){
                    int n=0;
                    java.lang.String S = scan.next();
                    // s[k]=S;
                    if(h.containsKey(S)){
                        n1=n1+(h.get(S)/2);
                    }
                    else{
                        char previous = 'l', current = 'l';
                        if(S.charAt(0)=='d' || S.charAt(0)=='f'){
                            previous = 'r'; 
                        }
                        else if(S.charAt(0)=='j' || S.charAt(0)=='k'){
                            previous = 'l'; 
                        }
                        for(int i=0; i<S.length();i++){
                            if(S.charAt(i)=='d' || S.charAt(i)=='f'){
                                current = 'l';
                            }
                            else if(S.charAt(i)=='j' || S.charAt(i)=='k'){
                                current = 'r';
                            }
                            if(previous==current){
                                previous=current;
                                n+=4;
                            }
                            else{
                                previous=current;
                                n+=2;
                            }
                        }
                        h.put(S,n);
                        n1=n1+n;
                    }
                }
                // int ans=0;
                // for(int i=0; i<N; i++){
                //     ans=ans +time[i];
                // }
                // Arrays.sort(s);
                // int count = 0;
                // for(int i=0; i<N-1; i++){
                //     if(s[i]!=s[i+1])
                //         count++;
                // }
                // count = N-count;
                // for(int e=0; e<count; e++){
                //     int temp = 0;
                //     for(int i=0; i<N-1; i++){
                //         if(s[i]==s[i+1]){
                //             temp=i;
                //         }
                //         else ;
                //     }
                //     ans = ans - time[temp]/2;
                // }
                // System.out.println(ans);
                System.out.println(n1);
            }
        }
        catch(Exception e){
            System.out.println(e);
            return;
        }
    }

    // public static int repeat(java.lang.String[] Old,java.lang.String New, int k){
    //     for(int i=0; i<k; i++){
    //         if(Old[i].equals(New)){
    //             // System.out.println("Yo");
    //             // System.out.println(i);
    //             return i;
    //         }
    //     }
    //     // System.out.println("YO");
    //     return 0;
    // }
}
