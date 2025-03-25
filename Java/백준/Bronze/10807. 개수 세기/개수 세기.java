import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N, v;
	    int sum = 0;
	    N = sc.nextInt();
	    int[] arr = new int[N];
	    for(int i = 0; i < N; i++){
	        arr[i] = sc.nextInt();
	    }
	    v = sc.nextInt();
	    for(int j = 0; j < N; j++){
	        if(v == arr[j]){
	            sum += 1;
	        }
	    }
	    System.out.println(sum);
	}
}