package Java.Algorithm.Recursion;

public class PrintArray {
    public static void displayArray(int arr[],int index){
        if(index==arr.length){
            System.out.println();
            return;
        }
        System.out.print(arr[index]+" ");
        displayArray(arr,index+1);
        System.out.print(arr[index]+" "); //for reverse printing
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        displayArray(arr,0);
    }
}
   