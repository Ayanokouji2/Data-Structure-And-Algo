package Java.HackerRank;

import java.util.*;

public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        int min_dist =0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int Dist = Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++) {
            if(list.contains(a.get(i))){
                min_dist = a.indexOf(a.get(i));
                Dist = Math.min(Dist,i-min_dist);
            }
            list.add(a.get(i));
        }
        
        return Dist<=a.size()?Dist:-1;
    }

    public static void main(String[] args) {
        int[] arr  = {2,1,3,2,1};
        List<Integer> a = new ArrayList<>();
        for(int val:arr){
            a.add(val);
        }
        System.out.println(minimumDistances(a));
    }
}
//  {1 ,2, 3, 4, 10}; 
