import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
        int count = 1;
        int range = 1;
        while (N > range) {
            range += 6 * count;
            count++;
        }
        System.out.println(count);
	}
}