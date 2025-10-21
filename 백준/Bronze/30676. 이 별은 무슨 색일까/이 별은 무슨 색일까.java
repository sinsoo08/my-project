import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    
	    if(a >= 620 && 780 >= a){
	        System.out.println("Red");
	    }
	    else if(a >= 590 && 620 > a){
	        System.out.println("Orange");
	    }
	    else if(a >= 570 && 590 > a){
	        System.out.println("Yellow");
	    }
	    else if(a >= 495 && 570 > a){
	        System.out.println("Green");
	    }
	    else if(a >= 450 && 495 > a){
	        System.out.println("Blue");
	    }
	    else if(a >= 425 && 450 > a){
	        System.out.println("Indigo");
	    }
	    else if(a >= 380 && 425 > a){
	        System.out.println("Violet");
	    }
	}
}