import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N, M=0;
	    int i=0, j=0, k=0;
	    N = sc.nextInt();
	    M = sc.nextInt();
	    int[] arr = new int[N + 1];
	    for(int a = 0; a < M; a++){
	        i = sc.nextInt();
	        j = sc.nextInt();
	        k = sc.nextInt();
	        for(int b = i; b <= j; b++){
	            arr[b] = k;   
	        }
	    }
	    for(int c = 1; c <= N; c++){
	        System.out.print(arr[c]+" ");
	    }
	}
}