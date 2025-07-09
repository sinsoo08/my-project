import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int HH = Integer.parseInt(st.nextToken());
        int MM = Integer.parseInt(st.nextToken());
        int startHour = 9;
        int startMinute = 0;
        int elapsed = (HH - startHour) * 60 + (MM - startMinute);
        if (elapsed < 0) {
            elapsed = 0;
        }
        System.out.println(elapsed);
    }
}