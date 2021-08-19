package Java.Collection_FrameWork.ArrayList.ArrayTraversal;

//! Matrix must be sorted 

public class SearchMat {
    public static int matSearch(int mat[][], int N, int M, int target){
        // your code here
        int i = 0;
        int j = M-1;
        while(i<N && j>=0){
            if(target==mat[i][j])return 1;
            else if(target>mat[i][j])i++;
            else j--;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[][] arr =  {{1,2,3},{4,5,6},{4,8,9}};
        System.out.println(matSearch(arr,arr.length,arr[0].length,8));
    }
}
