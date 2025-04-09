import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int B = sc.nextInt();
	    String b = Integer.toString(N, B).toUpperCase();
	    System.out.println(b);
	}
}