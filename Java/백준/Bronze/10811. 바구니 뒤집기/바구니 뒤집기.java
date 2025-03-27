import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = new int[101];
	    int N, M;
	    int temp;
	    N = sc.nextInt();
	    M = sc.nextInt();
	    for(int i = 0; i < N; i++){
	        arr[i] = i + 1;
	    }
	    for(int b = 0; b < M; b++){
	        int i = sc.nextInt() - 1;
	        int j = sc.nextInt() - 1;
	        for(int c = i; c < j; c++){
	            temp = arr[c];
	            arr[c] = arr[j];
	            arr[j] = temp;
	            j--;
	        }
	    }
	    for(int d = 0; d < N; d++){
	        System.out.println(arr[d]);
	    }
	}
}