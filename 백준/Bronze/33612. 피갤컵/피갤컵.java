import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int a = 2024;
	    int b = 8;
	    if(n != 1){
	        for(int i = 1; i < n; i++){
	            b += 7;
	            if(b > 12){
	                a =a + 1;
	                b =b - 12;
	            }
	        }
	    }
		System.out.println(a +" "+ b);
	}
}