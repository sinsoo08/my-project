import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    String a = "";
	    for(int i = S.length() - 1; i >= 0; i--){
	        a += S.charAt(i);
	    }  
	    if(S.equals(a)){
	        System.out.println("1");
	    }
	    else{
	        System.out.println("0");
	    }
	}
}