package Java.Collection_FrameWork.ArrayList;

import java.util.*;

public class SumOfTwoArray{

public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) {
      arr1[i] = in.nextInt();
    }
    
    int n2 = in.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) {
      arr2[i] = in.nextInt();
    }
    
    int[] sum = new int[n1>n2?n1:n2];
    int i = arr1.length-1;
    int j = arr2.length-1;
    int k = sum.length-1;
    int c =0;
    while(k>=0){
        int d = c;
        if(i>=0){
            d += arr1[i];
        }
        if(j>=0){
            d += arr2[j];
        }
        c = d/10;
        d = d%10;
        sum[k] = d;
        
        i--;
        j--;
        k--;
    }
    if(c!=0){
        System.out.println(c);
    }
    for(int val :sum){
        System.out.println(val);
    }
    in.close();
 }

}

