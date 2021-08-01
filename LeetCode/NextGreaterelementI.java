package Java.LeetCode;

import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

public class NextGreaterelementI {
    public static int[] nextGreaterElement(int[] num1, int[] num2) {
        int[] ans = new int[num1.length];
        Arrays.fill(ans,-1);

        // !For Reducing the time complexity to O(n^2) use HashMap

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i < num2.length; i++){
        //     map.put(num2[i],i);
        // }
        // int res[] = new int[num1.length];
        // Arrays.fill(res,-1);
        // for(int i = 0; i < res.length; i++){
        //     int index = map.get(num1[i]);
        //     for(int j=index+1; j < num2.length;j++){
        //         if(num2[j]>num1[i]){res[i] = num2[j];break;}
        //     }
        // }

        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    for(int k =j+1;k<num2.length;k++){
                        if(num2[k]>num1[i]){
                            ans[i]= num2[k];
                            break;
                        }
                   }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        nums1 = nextGreaterElement(nums1,nums2);
        for(int vl:nums1){
            System.out.print(vl+" ");
        }
    }
}
