import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int[] a = new int[8];
		for(i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for(i = 0; i < a.length; i++) {
			if(a[i] == 0 || a[i] == 1) {
				continue;
			}else {
				break;
			}
		}
		if(i == a.length) {
			System.out.println("S");
		}else {
			System.out.println("F");
		}
	}
}