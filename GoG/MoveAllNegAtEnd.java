package Java.GoG;

public class MoveAllNegAtEnd {
    public static void nsegregateElements(int arr[], int n){
        // Your code goes here
        int end =n-1;
        for(int i=0; i<n;i++){
            if(end<i)break;
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end--] = temp;
            }
       }
       for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
       }
      
    }
    public static void main(String[] args) {
        int[] arr =  {1, -1, 3, 2, -7, -5, 11, 6 };
        nsegregateElements(arr,arr.length);
    }
    
}
