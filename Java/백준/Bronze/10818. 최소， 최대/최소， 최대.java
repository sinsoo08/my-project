import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N;
	    int a = 0, b = 0;
	    N = sc.nextInt();
	    int[] arr = new int[N];
	    for(int i = 0; i < N; i++){
	        arr[i] = sc.nextInt();
	    }
	    a = arr[0];
	    b = arr[0];
	    for(int j = 0; j < N; j++){
	        if(a > arr[j]){
	            a = arr[j];
	        }
	    }
	    for(int k = 0; k < N; k++){
	        if(b < arr[k]){
	            b = arr[k];
	        }
	    }
	    System.out.println(a +" "+ b);
	}
}