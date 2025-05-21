import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int bitset = 0;
        while (m-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x;
            switch (command) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    bitset |= (1 << x);
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    bitset &= ~(1 << x);
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    sb.append((bitset & (1 << x)) != 0 ? "1" : "0").append("\n");
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    bitset ^= (1 << x);
                    break;
                case "all":
                    bitset = (1 << 21) - 1;
                    break;
                case "empty":
                    bitset = 0;
                    break;
            }
        }
        System.out.print(sb);
    }
}