import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int participant = sc.nextInt();
        result [] results = new result[participant];
        for(int i=0; i<participant; i++){
            results[i] = new result();
            results[i].score = sc.nextInt();
            results[i].attempt = sc.nextInt();
            results[i].time = sc.nextInt();
        }
        int [] max = {0,0,0};
        int [] winner = {0};
        for(int i=0; i<participant; i++){
            if(max[0]<=results[i].score){
                if(i>0){
                    if(results[winner[0]].score<=results[i].score){
                        if(results[winner[0]].score==results[i].score){
                            if(results[winner[0]].attempt>=results[i].attempt){
                                if(results[winner[0]].attempt==results[i].attempt){
                                    if(results[winner[0]].time>=results[i].time){
                                        if(results[winner[0]].time>results[i].time)
                                            winner[0]=i;
                            }
                        }
                        else
                            winner[0]=i;
                        }
                    } 
                        else
                            winner[0] = i;
                    }
                }
            }
        }
        System.out.println(winner[0]+1);
    } 
}
class result{
    int score;
    int attempt;
    int time;
}