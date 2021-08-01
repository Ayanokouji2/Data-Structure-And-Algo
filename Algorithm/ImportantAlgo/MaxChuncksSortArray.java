package Java.Algorithm.ImportantAlgo;

// !Chaining Algo

public class MaxChuncksSortArray {
    // * When the elements are not in the range of 0-->N-1.
    public static int maxChunksToSorted2(int[] arr) {
        int[] rmin = new int[arr.length+1];
        rmin[arr.length] = Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            rmin[i] = Math.min(arr[i],rmin[i+1]);
        }
        
        int max = Integer.MIN_VALUE;
        int count =0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
            if(max <= rmin[i+1])count++;
        }
        
        return count;
    }

    // ? When Elements are in the range of 0 --> n-1.
    public static int maxChunksToSorted1(int[] arr) {
        int count =0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
            if(max==i)count++;
        }

        return count ;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8,6,7};
        System.out.println(maxChunksToSorted2(arr));
        int[] arr2 = {1,0,2,3,4};
        System.out.println(maxChunksToSorted1(arr2));
    }
}
