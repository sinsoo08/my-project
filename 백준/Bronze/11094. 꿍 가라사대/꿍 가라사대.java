import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String ans = "";
            String str = br.readLine();

            if (str.contains("Simon says")){
                ans = str.substring(10);
            }else{
                continue;
            }

            sb.append(ans).append("\n");
        }
        System.out.println(sb.toString());
    }
}