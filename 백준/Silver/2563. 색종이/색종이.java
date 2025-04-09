import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[][] arr = new int[100][100];
	    int a = sc.nextInt();
	    for(int i = 0; i < a; i++){ 
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        for(int I = x; I < x + 10; I++){
	            for(int J = y; J < y + 10; J++){
	                arr[I][J] = 1;
	            }
	        }
	    }
	    int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) count++;
            }
        }
        System.out.print(count);
	}
}