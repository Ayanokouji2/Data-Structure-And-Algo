package Java.Algorithm.ImportantAlgo;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    
    public static List<Integer> majorityElement(int[] arr) {
        int val1 = arr[0];
        int val2 = arr[0];
        int count1 = 1;
        int count2 = 0;
        int start = 1;
        while(start<arr.length){
            if(val1 == arr[start])count1++;
            
            else if(val2 == arr[start]) count2++;
            
            else{
                if(count1 == 0 ){
                    val1 = arr[start];
                    count1 = 1;
                }
                else if(count2 == 0){
                    val2 = arr[start];
                    count2 = 1;
                }
                else{
                    count1--;
                    count2--;
                }
            }
            start++;
        }
        List<Integer> ans = new ArrayList<>();
        if(isGreater(arr,val1))ans.add(val1);
        
        if(val1!=val2 && isGreater(arr,val2))ans.add(val2);
        
        return ans;
    }
    
    public static boolean isGreater(int[] arr, int val){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(val == arr[i])count++;
        }
        return count > arr.length/3;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println("Answer -->:\s"+majorityElement(arr));
    }
}
