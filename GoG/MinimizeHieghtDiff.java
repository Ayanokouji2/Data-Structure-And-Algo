package Java.GoG;

import java.util.Arrays;

public class MinimizeHieghtDiff {
    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);

        int ans = arr[n-1] - arr[0];

        for(int i = 0; i < n-1; i++) {
            if(arr[i+1] < k) { 
                continue;
            }
            int currMin = Math.min(arr[i+1]-k, arr[0]+k);
            int currMax = Math.max(arr[i]+k, arr[n-1]-k);
            ans = Math.min(ans, currMax-currMin);
            System.out.println(currMin+" "+currMax);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int K = 5, N = 10;
        int Arr[] = {2, 6, 3, 4,7,2,10,3,2,1};
        System.out.println(getMinDiff(Arr,N,K));
    }
// 5
// 10
// 2 6 3 4 7 2 10 3 2 1
}
/* sort(arr, arr+n);

int ans = arr[n-1] - arr[0];

for(int i = 0; i < n-1; i++) {
if(arr[i+1] < k) {
continue;
}
int currMin = min(arr[i+1]-k, arr[0]+k);
int currMax = max(arr[i]+k, arr[n-1]-k);
ans = min(ans, currMax-currMin);
}

return ans;*/
