import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N;
	    N = sc.nextInt();
	    int sum = N / 4;
	    for(int i = 1; i <= sum; i++){
	        System.out.print("long ");
	    }
	    System.out.println("int");
	}
}