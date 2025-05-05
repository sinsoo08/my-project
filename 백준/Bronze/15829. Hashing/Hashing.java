import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		String s = br.readLine();
		long re = 0;
		long p = 1;
		for(int i = 0; i < l; i++) {
			re += ((s.charAt(i) - 96) * p);
			p = (p * 31) % 1234567891;
		}
		System.out.println(re % 1234567891);
	}
}