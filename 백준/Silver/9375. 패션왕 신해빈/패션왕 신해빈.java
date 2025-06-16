import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t -- > 0) {
			HashMap<String, Integer> hm = new HashMap<>();
			int n = sc.nextInt();
			while (n-- > 0) {
				sc.next();
				String kind = sc.next();
				if (hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind) + 1);
				} 
				else {
					hm.put(kind, 1);
				}
			}
			int result = 1;
			for (int val : hm.values()) {
				result *= (val + 1);
			}
			System.out.println(result - 1);
		}
	}
}