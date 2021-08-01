package Java.HackerRank;


public class MaxValueSubArray{
    public static int getMax(int[] arr){
        int max = arr[0];
        int curr_max = max;
     
        for(int i = 1; i < arr.length;i++){
           
            curr_max =Math.max(curr_max+arr[i],arr[i]);
            max = Math.max(max,curr_max);
        }
     
        return max;
    }

    public static void main(String[] args) {
        int[] array ={-2,2,5,-11,6};
        System.out.println(getMax(array));
    }
}