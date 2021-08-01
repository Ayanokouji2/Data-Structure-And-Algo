package Java.HackerRank;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;



public class ClimbingLeaderboard{
    public static List<Integer> Solution(List<Integer> ranked,List<Integer> player){
        
        List<Integer> AliceRank = new LinkedList<Integer>();
        Map<Integer,Integer> ranking = new HashMap<>();
        int rank =1;
        for(int item: ranked){
          if(!ranking.containsKey(item)) ranking.put(item,rank++);  
        }
        int initial = ranked.size()-1;
        for(int j =0;j<player.size();j++){
            int score = player.get(j);
            for(int i = initial; i>=0; i--){
                if(score >= ranked.get(i)){
                    rank = ranking.get(ranked.get(i));
                    initial = i-1;
                }
                else break;
            }
            AliceRank.add(rank);
        }
        // System.out.println( ranking);
        return AliceRank;
    } 
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(90);
        list.add(90);
        list.add(80);
        list.add(75);
        list.add(60);
        // list.add(100);
        // list.add(98);
        // list.add(97);
        // list.add(97);
        // list.add(95);
        // list.add(80);
        // list.add(75);
        // list.add(74);
        // list.add(60);
        // list.add(59);
        // list.add(58);
        // list.add(57);

        List<Integer> Alice = new LinkedList<>();
        Alice.add(50);
        Alice.add(65);
        Alice.add(77);
        Alice.add(90);
        Alice.add(102);
        
        System.out.println("Ranking Solution" + Solution(list,Alice)); 
    }
}