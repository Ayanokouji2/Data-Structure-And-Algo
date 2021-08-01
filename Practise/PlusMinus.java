package Java.Practise;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float post_cnt =0;
        float neg_cnt =0;
        float zero =0;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i)>0)post_cnt++;
            else if(arr.get(i)==0)zero++;
            else neg_cnt++;
        }
        System.out.format("%f\n",post_cnt/arr.size());
        System.out.format("%f\n",neg_cnt/arr.size());
        System.out.format("%f\n",zero/arr.size());
    }
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(0);
        num.add(-3);
        num.add(4);
        num.add(5);
        num.add(-6);
        plusMinus(num);
    }
}
