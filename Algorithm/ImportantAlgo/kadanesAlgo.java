package Java.Algorithm.ImportantAlgo;

public class kadanesAlgo {
    static int maxSubarraySum(int arr[], int n){
        int max=Integer.MIN_VALUE;
        int current_max=0;
        for(int i=0; i<n; i++){ 
            current_max += arr[i]; 
            current_max = Math.max(current_max,arr[i]);
            max = Math.max(current_max,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {0,-2,-3,-2,-5};
        System.out.println(maxSubarraySum(arr,arr.length));
    }
}
