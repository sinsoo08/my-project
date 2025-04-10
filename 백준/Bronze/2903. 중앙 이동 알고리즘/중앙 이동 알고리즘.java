import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int sum=0;
	    for(int i = 0; i < N; i++){
	        int point = (int)Math.pow(2, N) + 1;
	        sum = point * point;
	    }System.out.print(sum);
	}
}