import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[] count = new int[8001];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            count[nums[i] + 4000]++;
            sum += nums[i];
        }
        br.close();
        Arrays.sort(nums);
        int mean = (int) Math.round((double) sum / N);
        int median = nums[N / 2];
        int mode = findMode(count);
        int range = nums[N - 1] - nums[0];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(mean + "\n");
        bw.write(median + "\n");
        bw.write(mode + "\n");
        bw.write(range + "\n");
        bw.flush();
        bw.close();
    }
    private static int findMode(int[] count) {
        int maxCount = 0;
        int mode = 0;
        boolean second = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mode = i - 4000;
                second = false;
            } else if (count[i] == maxCount && !second) {
                mode = i - 4000;
                second = true;
            }
        }
        return mode;
    }
}