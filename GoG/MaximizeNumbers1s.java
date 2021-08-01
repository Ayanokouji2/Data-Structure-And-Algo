package Java.GoG;

public class MaximizeNumbers1s{
    static int findZeroes(int arr[], int n, int m) {
        int count =0;
        int len = 0;
        int i=0,j =0;
        while(i<arr.length){
            if(arr[i]==0){
                count++;
            }
            while(count>m){
                if(arr[j]==0){
                    count--;
                }
                j++;
            }
            len = Math.max(len,i-j+1); 
            i++;
        }
        // System.out.println();
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int m = 2;
        System.out.println(findZeroes(arr,arr.length,m));
    }
}