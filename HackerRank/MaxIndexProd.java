package Java.HackerRank;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class MaxIndexProd{

    public static int solve(List<Integer> arr) {
        // Write your code here
            // int max1= Integer.MIN_VALUE;
            // for(int i=0;i<arr.size();i++){
            //     if(arr.get(i)>max1)max1 = arr.get(i);
            // }
            int max = arr.size();
            List<Integer> list = new LinkedList<>();
            for(int i=0;i<arr.size();i++){
                int num = Math.abs( max-arr.get(i));
                if(num>0)list.add(num*arr.get(num-1));
                System.out.println(num);
            }
            Collections.sort(list,Collections.reverseOrder());
            System.out.println(list);
            return list.get(0);
    
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> arr = new LinkedList<>();
        // arr.add(5);
        // arr.add(4);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);
        for(int i = 0; i <10;i++){
            arr.add(in.nextInt());
        }
        System.out.println(solve(arr));
        in.close();
    }
}