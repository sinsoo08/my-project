import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int[] score2 = new int[9];
        int tot=0, count=0;
        for(int i=0; i<score.length; i++){
            score2[i]= sc.nextInt();
            tot+= score2[i];
            if(score2[i] > score[i]){
                count++;
            }else{
                count+=0;
            }
        }
        if(tot < 100)
            System.out.println("none");
        else{
            if(count > 0)
                System.out.println("hacker");
            else
                System.out.println("draw");
        }
    }
}