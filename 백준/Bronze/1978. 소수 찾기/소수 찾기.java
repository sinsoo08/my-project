import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int count = 0;
	    int n = sc.nextInt();
	    for(int i = 0; i < n; i++){
	        int a = sc.nextInt();
	        boolean b = true;
	        if(a <= 1){
	            b = false;
	        } else{
	            for(int j = 2; j <= Math.sqrt(a); j++){
	                if(a % j == 0){
	                    b = false;
	                    break;
	                }
	            }
	        }
	        if (b) {
                count++;
            }
	    }
	    System.out.println(count);
	}
}
