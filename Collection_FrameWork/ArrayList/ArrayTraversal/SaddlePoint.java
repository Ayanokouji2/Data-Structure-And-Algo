package Java.Collection_FrameWork.ArrayList.ArrayTraversal;

public class SaddlePoint {
    static int SaddleFind(int arr[][]){
        for(int i=0; i<arr.length; i++){
            int mvj = 0;
            for(int j=1;j<arr.length; j++){ //Finding the Smallest in row
                if(arr[i][j]<arr[i][mvj]){
                    mvj = j;
                }
            }
            
            boolean flag = false;
            for(int k=0;k<arr.length; k++){  //Finding the largest in Column
                if(arr[k][mvj]>arr[i][mvj]){
                    flag = true;
                }
            }


            if(!flag)return arr[i][mvj];
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[][] arr =  {{1,2,3},{4,5,6},{4,8,9}};
        System.out.println(SaddleFind(arr));

    }
}
