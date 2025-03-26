import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N, M;
	    N = sc.nextInt();
	    M = sc.nextInt();
	    int[] arr = new int[N];
	    for(int i = 0; i < N; i++){
	        arr[i] = i + 1;
	    }
	    for(int t = 0; t < M; t++){
	        int i = sc.nextInt() - 1;
	        int j = sc.nextInt() - 1;
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	    for(int num : arr){
	        System.out.print(num + " ");
	    }
	}
}