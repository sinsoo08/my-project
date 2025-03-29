import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N, sum=0;
	    N = sc.nextInt();
	    String ch = sc.next();
	    char[] chh = ch.toCharArray();
	    for(int i = 0; i < N; i++){
	        sum += chh[i] - 48;
	    }
		System.out.println(sum);
	}
}