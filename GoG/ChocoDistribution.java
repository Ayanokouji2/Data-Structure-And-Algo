package Java.GoG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChocoDistribution {
    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        ArrayList<Long> res = new ArrayList<>();
        Collections.sort(a);
        int indx =(int) m-1;
        int k=0;
        for(long i=indx;i<n;i++){
            getMin(res,a.get(k++),a.get(indx++));
        }
        long min = Integer.MAX_VALUE;
        for(int i=0;i<res.size();i++){
          if(min>res.get(i))min = res.get(i);
        }
        return min;
    }
    static void getMin(ArrayList<Long> arr,long min ,long max){
        arr.add(max-min);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Long> res = new ArrayList<Long>();
        for(int i=0;i<n;i++){
            res.add((long)in.nextInt());
        }
        System.out.println(findMinDiff(res,n,3));
        in.close();
    }
}
/*N = 7, M = 3
A = {7, 3, 2, 4, 9, 12, 56} */
