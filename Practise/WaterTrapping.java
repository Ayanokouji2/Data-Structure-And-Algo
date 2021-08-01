package Java.Practise;

//! Time complexity is --> O(N) and space is --> O(1).

public class WaterTrapping {
    static int amountofWater(int[] arr, int n){
        int ans =0;
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        for(int i =0;i<n;i++){
            ans += Math.min(left[i],right[i])-arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,0,1,3,2};
        System.out.println("Answer -->: " + amountofWater(arr,arr.length));
    }
}
