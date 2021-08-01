package Java.Algorithm.Recursion;

public class MinIdxK {
    static int minidx(int[] arr,int idx,int k){
        if(idx==arr.length)return -1;
        if(arr[idx]==k) return idx;
        else {
            int min = minidx(arr,idx+1,k);
            return min;
        }
    }
    static int maxidx(int[] arr,int idx,int k){
        if(idx == arr.length)return -1;
        int max = maxidx(arr,idx+1,k);
        if(max==-1){
            if(arr[idx]==k)return idx;
            else return -1;
        }
        else return max;

    }
    public static void main(String[] args) {
        int[] arr = {1,5,4,3,1,2,4,3};
        System.out.println(minidx(arr,0,3));
        System.out.println(maxidx(arr,0,3));
    }
}
