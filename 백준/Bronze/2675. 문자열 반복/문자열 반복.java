import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T=0, R=0;
	    T = sc.nextInt();
	    String[] S = new String[T];
	    for(int i = 0; i < T; i++){
	        R = sc.nextInt();
	        S[i] = sc.next();
	        
	        for(int j = 0; j < S[i].length(); j++){
	            for(int k = 0; k < R; k++){
	                System.out.print(S[i].charAt(j));
	            }
	        }
	        System.out.println();
	    }
	}
}