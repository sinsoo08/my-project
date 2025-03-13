import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int A, B, i1, i2, i3, i4;
	    Scanner sc = new Scanner(System.in);
	    A = sc.nextInt();
	    B = sc.nextInt();
	    
	    i1 = A * (B % 10);
	    i2 = A * ((B / 10) % 10);
	    i3 = A * (B / 100);
	    i4 = i1 + ( i2 * 10 ) + ( i3 * 100 );
	    
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	}
}