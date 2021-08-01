package Java.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NonDivisibleSubset {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
            int count=0;
            for(int i=0;i<s.size();i++){
                for(int j=i+1;j<s.size();j++){
                    int sum = s.get(i)+s.get(j);
                    if(sum%k!=0)count++;
                }
            }
            return count;
    
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<15;i++){
                list.add(in.nextInt());
            }
            Collections.sort(list);
            System.out.println(nonDivisibleSubset(7,list));
            in.close();
        }
}
/* 15 7
278 576 496 727 410 124 338 149 209 702 282 718 771 575 436*/
// 11 Ans

