package Java.Practise;

import java.util.Scanner;

public class RangeAddition {
    public static int[] addition(int length, int[][] queries){
        int[] arr = new int[length];
        int i =0;
        while(i<queries.length){
            int start = queries[i][0];
            int end = queries[i][1];
            int val = queries[i][2];
            arr[start] = val;
            if(end+1<arr.length){
                arr[end+1] = -val;
            }
            i++;
        }
        
        int sum = 0;
        for(i=0;i<length;i++){
            sum += arr[i];
            arr[i] = sum ;
        }
        return arr;
    } 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("size");
        int n = in.nextInt();
        int [][] queries = {{1,3,2},
                            {2,4,3},
                            {0,2,-2}};
        int arr[] = addition(n,queries);
        for(int val: arr ){
            System.out.print(val+" ");
        }
        in.close();
    }
}
