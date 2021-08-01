package Java.HackerRank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
            int[] x = new int[p.size()];
            int num =1;
            for(int i = 0; i < p.size(); i++){
                x[i] = num++;
            }
            List<Integer> index = new LinkedList<Integer>();
            for(int i = 0; i < p.size(); i++){
                for(int j = 0; j < p.size(); j++){
                    if(p.get(j)==x[i]){
                        index.add(j+1);
                    }
                }
            }
            List<Integer> ans = new LinkedList<Integer>();
            
            for(int i = 0; i < p.size(); i++){
                for(int j = 0; j < p.size(); j++){
                    if(p.get(j)==index.get(i)){
                        ans.add(j+1);
                    }
                }
            }
            return ans;
    }
    
    public static void main(String[] args) {
        // 4 3 5 1 2
        List<Integer> ans = new LinkedList<>();
        ans.add(4);
        ans.add(3);
        ans.add(5);
        ans.add(1);
        ans.add(2);
        System.out.println(permutationEquation(ans));
        System.out.println(permutationEquation2(ans));
    }
    public static List<Integer> permutationEquation2(List<Integer> x) {

        List<Integer> ans =new ArrayList<Integer>();
        for(int i=0; i<x.size(); i++){
            int index=x.indexOf(x.indexOf(i+1)+1)+1;
            ans.add(index);
        }
        return ans;
    }
}
