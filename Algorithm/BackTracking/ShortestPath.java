package Java.Algorithm.BackTracking;

public class ShortestPath{
    public static int ShortPath(int[][] arr,int i, int j, int x, int y){
        int row = arr.length;
        int col = arr[0].length;
        boolean[][] visited = new boolean[row][col];
        return ShortPath(arr, i, j, x, y, visited);
    }

    public static int ShortPath(int[][] arr,int i, int j, int x, int y,boolean visited[][]){
        if(!isPossible(arr,i,j,visited)) return 100000;
        // if(i<0 || j<0 || x<0 || y<0 || i>arr.length || j>arr[0].length || x>arr[0].length || y>arr[0].length) return -1;

        if(i==x && j==y) return 0;
        
        visited[i][j] = true;
        

        int right =ShortPath(arr, i, j+1, x, y,visited) +1;
        int left = ShortPath(arr, i, j-1, x, y,visited) +1;
        int bottom = ShortPath(arr, i+1, j, x, y ,visited)+1;
        int top = ShortPath(arr, i-1, j, x, y,visited) +1;

        visited[i][j] = false;
        return Math.min(Math.min(left,right),Math.min(bottom,top));
    }

    public static boolean isPossible(int arr[][], int i, int j,boolean visited[][]){
        int row = arr.length;
        int col = arr[0].length;
        return i>=0 && j>=0 && i<row && j<col && arr[i][j]==1 && !visited[i][j];
    } 
    public static void main(String[] args) {
        int a[][] = {{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                    { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
                    { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
                    { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
                    { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
                    { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
                    { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                    { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                    { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                    { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 }};
        System.out.println(ShortPath(a,0,0,8,9));
    }
}