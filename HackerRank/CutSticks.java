package Java.HackerRank;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CutSticks {
    public static List<Integer> /*Set<Integer>*/ cutTheSticks(List<Integer> arr) {
        // Write your code here
            List<Integer> result = new ArrayList<Integer>();
            while (arr.size()>1){
                result.add(arr.size());
            int min = min(arr);
            for(int i = 0; i < arr.size(); i++){
                int newMin = arr.get(i) - min;
                arr.set(i, newMin);
            }
            List<Integer> newarr = new ArrayList<Integer>();
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i)!=0)newarr.add(arr.get(i));
            }
            result.add(newarr.size());
            arr.clear();
            arr.addAll(newarr);
            }
            Set<Integer> set = new LinkedHashSet<Integer>();
            for(int i = 0; i < result.size(); i++){
                if(!set.contains(result.get(i)) && result.get(i)!=0)set.add(result.get(i));
            }
            List<Integer> ans = new ArrayList<Integer>(set);

            return ans;
        }
        static int min(List<Integer> arr){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.size(); i++){
                if((min>arr.get(i))) min = arr.get(i);
            }
            return min;
        }

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(8);
            list.add(8);
            list.add(14);
            list.add(10);
            list.add(3);
            list.add(5);
            list.add(14);
            list.add(12);
            System.out.println(cutTheSticks(list));
            // 8 8 14 10 3 5 14 12
        }
}
