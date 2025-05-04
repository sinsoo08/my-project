import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    HashSet<String> re = new HashSet<>();
	    for(int i = 0; i < a; i++){
	        String s1 = sc.next();
	        String s = sc.next();
	        if(s.equals("enter")){
	            re.add(s1);
	        }
	        else if(s.equals("leave")){
	            re.remove(s1);
	        }  
	    }
	    List<String> result = new ArrayList<>(re);
            Collections.sort(result, Collections.reverseOrder());
		for(String s1 : result) {
            System.out.println(s1);
        }
	}
}