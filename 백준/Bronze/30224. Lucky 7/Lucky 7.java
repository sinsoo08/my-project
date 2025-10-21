import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    String a_num = Integer.toString(a);
	    if(!a_num.contains("7") && a % 7 != 0){
	        System.out.println(0);
	    }
	    else if(!a_num.contains("7") && a % 7 == 0){
	        System.out.println(1);
	    }
	    else if(a_num.contains("7") && a % 7 != 0){
	        System.out.println(2);
	    }
	    else if(a_num.contains("7") && a % 7 == 0){
	        System.out.println(3);
	    }
	   
	}
}