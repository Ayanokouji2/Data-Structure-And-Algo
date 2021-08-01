package Java.Algorithm.ImportantAlgo;

import java.util.Scanner;

public class ArrayProdExceptItself{
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] right_product =  new long[n];
        long product =1;
        for(int i=n-1;i>=0;i--){
            product *= nums[i];
            right_product[i] = product;
        }
        
        product =1;
        long[] ans = new long[n];
        for(int i=0;i<n-1;i++){ // bcz i+1 will give Array index bound exception for right array.
            
            ans[i] = product*right_product[i+1];
            product *=nums[i];
            
        }
        ans[n-1] = product;
        return ans;
	} 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        long[] nums = productExceptSelf(arr,arr.length);
        for(long val:nums){
            System.out.print(val+" ");
        }
        in.close();
    }
}