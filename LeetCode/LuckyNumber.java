package Java.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class LuckyNumber {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> row = new LinkedList<>();
        for(int i=0;i<m;i++){
            int min_row = matrix[i][0];
            for(int j =1;j<n;j++){
                if(matrix[i][j]<min_row) min_row = matrix[i][j];
            }
            row.add(min_row);

        }
        List<Integer> col = new LinkedList<>();
        for (int j=0;j<n;j++) {
            int maxm = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++){
                if (matrix[i][j] > maxm){
                    maxm = matrix[i][j];
                }
            }
            col.add(maxm);
        }
        List<Integer> ans = new LinkedList<>();
        for(int i=0;i<row.size();i++){
            if(col.contains(row.get(i))){
                ans.add(row.get(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }
}
