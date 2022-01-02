import java.util.*;

public class Flow002{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-->0){
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(A%B);
        }
    }
}