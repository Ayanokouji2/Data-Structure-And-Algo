package Java.Collection_FrameWork.ArrayList.ArrayTraversal;

public class ExitPointInArray {
    static int[] exitpath(int[][] matrix){
        int[] indexs = new int[2];
        int i=0,j=0;
        int dir =0;
        while(true){
            dir = (dir+matrix[i][j])%4;
            if(dir==0)j++;  //Moving in East
            else if(dir==1)i++;   //Moving North
            else if(dir==2)j--;    //Moving West
            else if(dir==3)i--;    //Moving South

            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==matrix.length){
                i--;
                break;
            }
            else if(j==matrix[0].length){
                j--;
                break;
            }
            indexs[0] = i;
            indexs[1] = j;

        }
        return indexs;
    }
    public static void main(String[] args) {
        int[][] path =  {{0, 1, 0},
                        {0, 1, 1}, 
                        {0, 0, 0}};
        int[] ans = exitpath(path);
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
}
