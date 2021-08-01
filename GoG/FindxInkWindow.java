package Java.GoG;
import java.util.*;
public class FindxInkWindow{

    public static boolean solution(int[] arr, int k , int n, int x){
        int i;
        boolean Have = false;

        for( i=0;i<n;i=i+k){

            for(int j=0;j<k;j++){

                if(i+j<n && arr[i+j]==x)
                    break;

                if(j==k) 
                    return false;

                if(i+j>= n) 
                    return false;
          }

        }
        if(i>=n)
            return true;
        else 
            return Have;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Test cases");
        // int t = in.nextInt();
        // while(t>=0){
            
        // }
        System.out.println("Size");
        int size = in.nextInt();
        System.out.println("Elements");
        int[] a = new int[size];
        // int[] a = {3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12,3};
        for(int i =0;i<size;i++){
            a[i] = in.nextInt();
        }
        System.out.println("Element to Find");
        int key = in.nextInt();
        System.out.println("Size of window");
        int win = in.nextInt();
        System.out.println(solution(a,win,a.length,key));
        in.close();
    }
    //test cases
    //21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25
    //3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3
}