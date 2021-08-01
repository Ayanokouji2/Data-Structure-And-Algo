package Java.Algorithm.Recursion;

public class MaxInArray {
    static int max(int[] arr, int index){
        if(index == arr.length)return index;
        int num =max(arr,index+1);
        return Math.max(num,arr[index]);
    }   
    public static void main(String[] args) {
        int[] arr = {7000,1200,1044,410,100};
        System.out.println("Maximum in the Array: "+max(arr,0));
    }
}
