package Java.LeetCode;
// LeetCode/Pepcoding.
import java.util.*;
public class NextGreaterelementII {
    public static int[] nextGreater(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        st.push(nums[nums.length - 1]);
        for(int i=nums.length-2;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=st.peek())st.pop();
            st.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]>=st.peek())st.pop();
            if(st.isEmpty())ans[i]=-1;
            else ans[i] = st.peek();
            st.push(nums[i]);
        }
        System.out.println(st);
        return ans;
    }

    public static void main(String[] args) {
        int[] query = { 3, 8, 4, 1, 2 };
        query = nextGreater(query);
        for (int val : query) {
            System.out.print(val + " ");
        }
    }
}
