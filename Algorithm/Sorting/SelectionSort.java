package Java.Algorithm.Sorting;

public class SelectionSort {
    static int[] Selection(int arr[]){
        int index = 0;
        while(index < arr.length-1){
            int minvalue = Integer.MAX_VALUE;
            int idx =0;
            for(int i = index;i<arr.length;i++){
                if(minvalue>arr[i]){
                    idx = i;
                    minvalue = arr[i];
                }
            }
            int temp = arr[index];
            arr[index++] = minvalue;
            arr[idx] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {7,10,5,41,89,34,3521,1,4};
        arr = Selection(arr);
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
