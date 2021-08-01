package Java.GoG;

import java.util.Scanner;
// NOT SOLVED INCORRECT OUTPUT.
public class MaxProdSubarray {
    static long maxProduct(int[] arr, int n) {
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<0)count++;
        }
        int curr =1;
        int max=Integer.MIN_VALUE;
        if(count ==1){
            for(int i=0;i<n;i++){
                curr = curr*arr[i];
                curr = Math.max(curr,arr[i]);
                max = Math.max(curr,max);
                
                if(curr <1)curr=1;
            }
        }
       else{
            for(int i=0;i<n;i++){
                curr = curr*arr[i];
                max = Math.max(curr,max);
                if(curr ==0)curr=1;
            }
        }
        return max;

    }

    static long maxProduct2(int[] arr, int n) {
        long max = arr[0];
        long min = arr[0];
        long result = arr[0];
        for(int i = 1; i<n;i++){
            long temp_max = Math.max(max * arr[i],Math.max(min*arr[i],arr[i]));
            min = Math.min(max*arr[i],Math.min(min*arr[i],arr[i]));
            max = temp_max;
            result = Math.max(result,max);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Result of the above operation --> : "+maxProduct2(arr,n));
        in.close();
    }
}
