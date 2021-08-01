package Java.Practise;


//* Rotating an array for any given number in the number system.

public class RotateArray {

    static int[] rotating(int arr[], int n,int k){
        k = k%n; 
        if(k<0)k+=n;
        int km=0;
        int[] part1 = new int[k];  //? Storing the first k elements of the array.
        int[] part2 = new int[n-k]; //! Storing the rest of elements of the array.
        for(int i=0;i<k;i++)part1[i]=arr[i];
        for(int i=k;i<n;i++){part2[km++]=arr[i];}
        reverse(part1); 
        reverse(part2); 
        km=0;
        for(int i=0;i<n;i++){
            int val = (i<k)?part1[i]:part2[km++];
            arr[i] = val;
        }
        reverse(arr);
        return arr;
    }
    static void reverse(int[] arr ){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    } 

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = rotating(arr,arr.length,-1);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }    
}
