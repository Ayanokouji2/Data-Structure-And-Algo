package Java.GoG;
// import java.util.*;

public class DistributeCandies {
    static int[] distributeCandies(int N, int K) {
        int[] ans = new int[K];
        int in =1;
        int dist =0;
        int time = 0;
        for(int i=1;i<=K;i++){
            dist = time+i;
            N-=dist;
            if(N>=0){
                ans[i-1] += dist;
            }
            else{
                ans[i-1] += N+dist;
                break;
            }

            if(i==K && N>=0){
                i=0;
                time = in++*K;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 10;
        int K = 3;
        int[] res = distributeCandies(N, K);
        System.out.print("Answers--> ");
        for(int i =0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
    }
}
// 66 56 60 64 68 72 76 80