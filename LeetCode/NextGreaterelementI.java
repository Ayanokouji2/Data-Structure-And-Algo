package Java.LeetCode;
// PepCoding,LeetCode.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterelementI {
    public static int[] nextGreaterElement(int[] num1, int[] num2) {
        int[] ans = new int[num1.length];
        Arrays.fill(ans,-1);

        // !For Reducing the time complexity to O(n^2) use HashMap

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
        int[] nums1 = {1,3,5,2,4,6};
        int[] nums2 = {6,5,8,4,3,2,1,7};
        nums1 = nextGreater(nums2,nums1);
        for(int vl:nums1){
            System.out.print(vl+" ");
        }
    }
    public static int[] nextGreater(int[] nums, int[] query) {
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        int[] nge = new int[nums.length];
        int ans[] = new int[query.length];
        st.push(nums.length-1);
        nge[nums.length-1] = -1;
        for(int i=nums.length-2;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = -1;
            }
            else nge[i] = nums[st.peek()];
            st.push(i);
        }
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],nge[i]);
        }
        for(int i=0;i<query.length;i++){
            ans[i] = map.get(query[i]);
        }
        return ans;
    }
}
