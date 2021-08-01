package Java.Practise.Intervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])); //*Lamda Function used for Sorting.
        
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] interval:intervals){
            if(ans.size()==0){
                ans.add(interval);
            }
            else{
                int[] prevInterval = ans.get(ans.size()-1);
                if(prevInterval[1]>=interval[0]){
                    prevInterval[1] = Math.max(prevInterval[1],interval[1]);
                }
                else{
                    ans.add(interval);
                }
            }
        }
        return ans.toArray(new int[ans.size()][]); //?Conversion of List to Array.
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{4,6},{5,7},{9,11}};
        int[][] output = merge(intervals);
        for(int[] val:output){
            System.out.println(Arrays.toString(val));
        }
    }
}
