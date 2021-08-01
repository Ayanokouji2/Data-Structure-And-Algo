package Java.College;

import java.util.*;

public class Max {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter i");
    int n = in.nextInt();
    System.out.println("Enter j");
    int m = in.nextInt();
    int[][] arr = new int[n][m];
    System.out.println("Enter the elements in the Array");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            arr[i][j] = in.nextInt();
        }
    }
    int max = arr[0][0];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(max < arr[i][j]){
                max = arr[i][j];
            }
        }
    }
    System.out.println("Maximum Element: " + max);
    in.close();
    }
}
