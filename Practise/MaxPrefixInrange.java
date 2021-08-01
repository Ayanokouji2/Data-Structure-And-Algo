package Java.Practise;

public class MaxPrefixInrange{
    static long[] maxPrefixes(long a[], long L[], long R[], long N, long Q) 
    {
        long[] ans = new long[(int)Q];
        long sum =0;
        for(int j =0;j<Q;j++){
            long start = L[j];
            long end = start + R[j]-1;
            sum=0;
            long cursum =0;
            for(int i=(int)start;i<=end;i++){
                cursum += a[i];
                sum = (long)Math.max(sum,cursum);
            }
            ans[j] = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        long[] a = {-1, 2, 3, -5} ;
        long R[] = {3,3};
        long L[] = {0,1};
        R = maxPrefixes(a,L,R,4,2);
        for(long val: R){
            System.out.print(val+" ");
        } 
    }
}