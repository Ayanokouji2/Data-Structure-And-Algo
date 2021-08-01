package Java.LeetCode;
import java.util.*;

public class ValidTriangle{
    public static int trianglecount(int arr[]){
        Arrays.sort(arr);
        int right ;
        int left ;
        int count =0;
       for(int i=arr.length-1;i>=2;i--){
           left=0;
           right = i-1;
            while(left<right){
                if(arr[left] + arr[right]>arr[i]){
                    System.out.println(arr[left] +" "+ arr[right]+" "+arr[i]);
                    count += right-left;
                    right--;
                }
                else{
                    left++;
                }
            }  
        }   
        return count;
    }
    public static void main(String[] args) {
        int sides[] = {4,2,3,4};
        
        System.out.println(trianglecount(sides));
    }
}