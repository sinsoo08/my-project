import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0;
		int p = 0;
		String[] w = new String[n];
		int d2 = 0;
		for(int i = 0; i < w.length; i++) {
			w[i] = sc.next();
		}
		for(int i = 0; i < w.length; i++) {
			if(w[i].equals("D")) {
				d++;
			}else if(w[i].equals("P")) {
				p++;
			}
			
			if(d > p) {
				d2 = d - p;
			}else {
				d2 = p - d;
			}
			
			if(d2 >= 2) {
				break;
			}
		}
		System.out.println(d + ":" + p);
	}
}