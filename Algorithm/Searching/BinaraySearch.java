package Java.Algorithm.Searching;

public class BinaraySearch {
    static boolean bsearch(int arr[] , int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid] > key)high = mid-1;
            else low = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.print(bsearch(arr,-1));
    }
}
