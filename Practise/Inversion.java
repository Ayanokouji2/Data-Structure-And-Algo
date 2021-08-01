package Java.Practise;

public class Inversion {
    public static int[] inversion(int arr[]){
        int[] res = new int[arr.length];
        for(int i= 0;i<arr.length;i++ ){
            swap(res,i,arr[i]);
        }
        return res;
    }
    static void swap(int res[],int idx , int val){
        res[val] = idx ;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1,0};
        int[] res = inversion(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
        for(int val:res){
            System.out.print(val+" ");
        }
    }
}
