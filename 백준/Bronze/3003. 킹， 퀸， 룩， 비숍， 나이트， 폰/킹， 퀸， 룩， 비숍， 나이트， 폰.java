import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = new int[6];
	    int a=0, b=0, c=0, d=0, e=0, f=0;
	    for(int i = 0; i < 6; i++){
	        arr[i] = sc.nextInt();
	    }
	    a = 1 - arr[0];
	    b = 1 - arr[1];
	    c = 2 - arr[2];
	    d = 2 - arr[3];
	    e = 2 - arr[4];
	    f = 8 - arr[5];
	    System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+f);
	}
}