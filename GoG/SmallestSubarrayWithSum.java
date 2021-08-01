package Java.GoG;

public class SmallestSubarrayWithSum {
    public static int sb(int a[], int n, int x) {
        int left =0;
        int right =0;
        int size =n+1;
        int sum = 0;
        while(right<n){
            while(sum<=x && right <n){
                sum += a[right++];
            }
            while(left<right && sum>x){
                size = Math.min(size,right-left);
                sum -= a[left++];
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int A[] = {1, 10,3,40,18};
        int x  =  50;
        System.out.println("Answer -->:\s"+sb(A, A.length, x));
    }
}
