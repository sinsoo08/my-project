import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a, b;
	    for(;;){
	        a = sc.nextInt();
	        b = sc.nextInt();
	        if(a == 0 && b == 0){
	            break;
	        }
	        if(a % b == 0){
	            System.out.println("multiple");
	        }
	        else if(b % a == 0){
	            System.out.println("factor");
	        }
	        else{
	            System.out.println("neither");
	        }
	    }
	}
}