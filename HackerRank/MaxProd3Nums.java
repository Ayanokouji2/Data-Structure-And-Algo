package Java.HackerRank;

import java.util.Arrays;

public class MaxProd3Nums {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int min1 = nums[0];
        int min2 = nums[1];
        int min3 = nums[2];
        int max1 = nums[nums.length-1];
        int max2 = nums[nums.length-2];
        int max3 = nums[nums.length-3]; 
        return Math.max(min1*min2*max1,Math.max(min1*min2*min3,max1*max2*max3));
    }
    public static void main(String[] args) {
        System.out.println(maximumProduct(new int[]{-1,-2,-3,3,3}));
    }
}
