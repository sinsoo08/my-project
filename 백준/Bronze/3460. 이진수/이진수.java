import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			while(true) {
				if(n == 1) {
					System.out.println(count);
					break;
				}
				if(n % 2 == 1) {
					System.out.print(count + " ");
				}
				count++;
				n /= 2;
			}
		}
	}
}