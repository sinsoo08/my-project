import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if((char)a.charAt(i) == 'a' || (char)a.charAt(i) == 'e' || (char)a.charAt(i) == 'i' || (char)a.charAt(i) == 'o' || (char)a.charAt(i) == 'u') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}