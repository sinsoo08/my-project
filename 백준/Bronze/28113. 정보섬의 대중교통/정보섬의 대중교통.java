import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int subway;
		if(n <= b && b == a) {
			System.out.println("Anything");
		}else if(n <= b && b - a > 0) {
			System.out.println("Bus");
		}else {
			System.out.println("Subway");
		}
	}
}