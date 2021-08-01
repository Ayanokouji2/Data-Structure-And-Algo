package Java.HackerRank;
import java.util.*;
public class MaxElementStack {
    public static List<Integer> getMax(List<String> operations) {
        // Write your code here
            Stack<Integer> temp = new Stack<Integer>();
            for(int i=0;i<operations.size();i++){
                temp.add(Integer.valueOf(operations.get(i)));
            }
            // Stack<Integer> traverse = temp;
            List<Integer> max = new LinkedList<Integer>();
            max.add(0);
            for(Integer traverse : temp){
                if(traverse>max.get(0)){
                    max.remove(max.get(0));
                    max.add(traverse);
                }
            }
            return max;            
        }
        public static void main(String[] args) {
            List<String> x = new LinkedList<String>();
            x.add("12");
            x.add("10");
            x.add("18");
            x.add("187");
            x.add("15");
            x.add("1");
            List<Integer> ans = getMax(x);
            System.out.println(ans);
        }
}
