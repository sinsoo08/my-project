import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N=0;
	    int[] arr = new int[31];
	    for(int i = 0; i < 28; i++){
	        N = sc.nextInt();
	        arr[N] = 1;
	    }
	    for(int j = 1; j <= 30; j++){
	        if(arr[j] == 0){
	            System.out.println(j);
	        }
	    }  
	}
}