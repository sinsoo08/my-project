import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str;
	    int t = sc.nextInt();
	    for(int i = 0; i < t; i++){
	        str = sc.next();
	        System.out.print(str.charAt(0));
	        System.out.println(str.charAt(str.length() - 1));
	    }
	}
}