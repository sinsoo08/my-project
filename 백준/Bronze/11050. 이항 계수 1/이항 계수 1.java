import java.util.*;
public class Main
{
    public static int f(int n) {
        if (n <= 1) return 1;
        return n * f(n - 1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    
		int re = f(n) / (f(k) * f(n - k));
        System.out.println(re);
	}
}