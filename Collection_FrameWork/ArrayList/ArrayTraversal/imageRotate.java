package Java.Collection_FrameWork.ArrayList.ArrayTraversal;
// Clock wsie Rotation
import java.util.Arrays;

public class imageRotate {
    static int[][] Clockrotation(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int tempp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tempp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int tempp = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = matrix[i][j];
                matrix[i][j] = tempp;
            }
        }
        return matrix;
    }

    // AntiClock Wise Rotation

    static void rotationAnti(int arr[][]){ 
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length-1-i][j];
                arr[arr.length-1-i][j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        // Clockrotation(arr);
        rotationAnti(arr);
        for(int[] val:arr){
            System.out.println(Arrays.toString(val));
        }
    }
}
