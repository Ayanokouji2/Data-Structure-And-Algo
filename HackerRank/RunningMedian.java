package Java.HackerRank;
//Time Complexity Excceded;"Needs to optimize";
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RunningMedian{
    public static List<Double> runningMedian(List<Integer> a) {
        // Write your code here
            int index = 0;
            List<Double> ans = new ArrayList<Double>();
            List<Double> result = new ArrayList<Double>();
            result.add((double)a.get(0));
            ans.add((double)a.get(0));
            for(int i=1;i<a.size();i++){
                ans.add((double)a.get(i));
                Collections.sort(ans);
                if(ans.size()%2==0){
                    index = ans.size()/2;
                    result.add((double)(ans.get(index-1)+ans.get(index))/2);                    
                }
                else{
                    index = ans.size()/2;
                    result.add((double)(ans.get(index)));
                }
            }
            return result;
        }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add(4);
        // nums.add(5);
        // nums.add(6);
        // nums.add(7);
        // nums.add(8);
        // nums.add(9);
        // nums.add(10);
        nums.add(12);
        nums.add(4);nums.add(5);nums.add(3);nums.add(8);nums.add(7);
        System.out.println(runningMedian(nums));
    }
}