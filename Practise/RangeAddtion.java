package Java.Practise;

import java.util.ArrayList;
import java.util.List;

public class RangeAddtion {
    static int[] addtion(List<List<Integer>> queries, int length){
        return new int[5];
    }
    public static void main(String[] args) {
        List<Integer> q1 = new ArrayList<Integer>();
        q1.add(1);
        q1.add(3);
        q1.add(2);
        List<Integer> q2 = new ArrayList<Integer>();
        q2.add(2);
        q2.add(4);
        q1.add(-2);
        List<List<Integer>> queries = new ArrayList<List<Integer>>();
        queries.add(q1);
        queries.add(q2);
        int arr[] = addtion(queries,5);
        for(int val:arr){
            System.out.print(val +" ");
        }
    }
}
