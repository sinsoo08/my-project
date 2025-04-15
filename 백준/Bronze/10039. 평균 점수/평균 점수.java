import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i <= 5; i++){
		    int a = sc.nextInt();
		    if(a < 40){
		        a = 40;
		    }
		    sum += a;
		}
		System.out.println(sum/5);
	}
}