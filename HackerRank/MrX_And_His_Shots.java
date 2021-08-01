package Java.HackerRank;

import java.util.*;

public class MrX_And_His_Shots {

    public static int solve(List<List<Integer>> shots, List<List<Integer>> players) {
        int count = 0;
        for(int i = 0; i < players.size(); i++) {
            for(int j = 0; j <shots.size(); j++) {
                if(players.get(i).get(0)<=shots.get(j).get(1)
                 && players.get(i).get(1)>=shots.get(j).get(1)){
                    count++;
                }
    
            }
        }
      
        return count;    
    }
    public static void main(String[] args) {
        
        List<List<Integer>> shot = new LinkedList<List<Integer>>();
        List<List<Integer>> players = new LinkedList<List<Integer>>();
        List<Integer> range1 = new LinkedList<>();
        List<Integer> range2 = new LinkedList<>();
        List<Integer> range3 = new LinkedList<>();
        List<Integer> range4 = new LinkedList<>();
        List<Integer> player1 = new LinkedList<>();
        List<Integer> player2 = new LinkedList<>();
        List<Integer> player3 = new LinkedList<>();
        List<Integer> player4 = new LinkedList<>();
        range1.add(1);
        range1.add(2);
        range2.add(2);
        range2.add(3);
        range3.add(4);
        range3.add(5);
        range4.add(6);
        range4.add(7);
        player1.add(1);
        player1.add(5);
        player2.add(2);
        player2.add(3);
        player3.add(4);
        player3.add(7);
        player4.add(5);
        player4.add(7);
        shot.add(range1);
        shot.add(range2);
        shot.add(range3);
        shot.add(range4);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        System.out.println(players);
        System.out.println(shot);
        System.out.println(solve(shot, players));

    }
/*1 2 
2 3
4 5
6 7
1 5
2 3
4 7
5 7 */
}
