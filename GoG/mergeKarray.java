package Java.GoG;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class   mergeKarray {
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {   
        PriorityQueue<Integer> x = new PriorityQueue<>();
        for(int i=0;i<K;i++){
            for(int j =0;j<K;j++){
                x.add(arr[i][j]);
            }
        }
        int size = x.size();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<size;i++){
            ans.add(x.poll());
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{7,8,9},{4,5,6}};
        System.out.println(mergeKArrays(arr, arr.length));
    }
}
