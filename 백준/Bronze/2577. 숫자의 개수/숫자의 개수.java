import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v = (in.nextInt() * in.nextInt() * in.nextInt());
		String s = Integer.toString(v);
		for (int i = 0; i < 10; i++) {
			int c = 0;
			for (int j = 0; j < s.length(); j++) {
				if ((s.charAt(j) - '0') == i) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}