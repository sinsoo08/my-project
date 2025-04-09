import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char[][] S = new char[5][15];
	    
	    for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                S[i][j] = ' ';
            }
        }
	    for(int i = 0; i < 5; i++){
	        String line = sc.nextLine();
	        for(int j = 0; j < line.length(); j++){
	            S[i][j] = line.charAt(j);
	        }
	    }
	    for(int j = 0; j < 15; j++){
	        for(int i = 0; i < 5; i++){
	            if(S[i][j] != ' '){
	                System.out.print(S[i][j]);
	            }
	        }
	    }
	}
}