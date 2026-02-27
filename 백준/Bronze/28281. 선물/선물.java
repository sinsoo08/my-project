import java.io.*;
import java.util.*;
public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int birthday = Integer.parseInt(st.nextToken());
        int socks = Integer.parseInt(st.nextToken());

        int [] arr = new int[birthday];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < birthday; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int [] money = new int [birthday-1];

        for (int i = 0; i < birthday-1; i++) {
            money[i] = arr[i]+arr[i+1];
        }

        Arrays.sort(money);

        int answer = money[0] * socks;

        sb.append(answer);

        System.out.println(sb.toString());

    }
}