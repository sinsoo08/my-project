import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    String[] s = new String[a];
	    for(int i = 0; i < a; i++){
	        s[i] = sc.next();
	    }
	    
	    int len = s[0].length();
	    
	    for (int i = 1; i <= len; i++) {
            Set<String> set = new HashSet<>();

            for (String num : s) {
                String suffix = num.substring(len - i);
                set.add(suffix);
            }

            if (set.size() == a) {
                System.out.println(i);
                break;
            }
        }
	}
}