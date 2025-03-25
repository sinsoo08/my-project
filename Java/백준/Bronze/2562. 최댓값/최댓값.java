import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = new int[9];
	    int a=0;
	    int b=0;
	    for(int i = 0; i < 9; i++){
	        arr[i] = sc.nextInt();
	        if(arr[i] > a){
	            a = arr[i];
	            b = i;
	            b += 1;
	        }
	    }
	    System.out.println(a);
	    System.out.println(b);
	}
}