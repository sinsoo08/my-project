import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n, x;
	    n = sc.nextInt();
	    x = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int j = 0; j < n; j++){
	        if(x > arr[j]){
	            System.out.print(arr[j] + " ");
	        }
	    }
	}
}