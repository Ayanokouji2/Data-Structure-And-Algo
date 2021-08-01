package Java.Algorithm.Recursion;

public class FloodFill {

    static void Flooding(int[][] arr, int row, int col, int newFill, int prevFill){

        int r = arr.length;
        int c = arr[0].length;
        if(row<0 || row>=r || col<0 || col>=c)return ;
        
        if(newFill == prevFill) return;

        if(arr[row][col] != prevFill) return;

        arr[row][col] = newFill;

        Flooding(arr, row-1, col, newFill, prevFill);

        Flooding(arr, row, col-1, newFill, prevFill);

        Flooding(arr, row+1, col, newFill, prevFill);

        Flooding(arr, row, col+1, newFill, prevFill);

    }

    static void printMatrix(int[][] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int a[][] = {{2,2,1,2,2},
                     {1,1,1,1,1},
                     {2,2,1,2,2}};

        Flooding(a,1,2,0,1);
        printMatrix(a);
    }
}
