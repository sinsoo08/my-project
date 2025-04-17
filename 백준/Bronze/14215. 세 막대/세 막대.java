import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int sum = 0;
	    if(a > b && a > c){
	         if(b + c <= a){
	             a = c+b-1;
	         }
	         sum = a+b+c;
	    }
	    else if(b > a&& b > c){
	        if(a + c <= b){
	             b = c+a-1;
	         }
	         sum = a+b+c;
	    }
	    else{
	        if(a + b <= c){
	             c = a+b-1;
	         }
	         sum = a+b+c;
	    }
		System.out.println(sum);
	}
}