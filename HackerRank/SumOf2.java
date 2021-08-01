package Java.HackerRank;

import java.util.*;

public class SumOf2 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        int[] arr ={2 , 1 , 3 , -4, 2};
        boolean found = false;
        int sum=0;
        for(int item : arr){
            s.add(sum);
            sum += item;
            if(s.contains(sum)){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
