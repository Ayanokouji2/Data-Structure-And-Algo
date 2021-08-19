package Java.Collection_FrameWork.Stack;
// Pepcoding,HAckerrank

import java.util.*;
public class CelebrityProblem {
    private static int celebrity(int[][] arr){
        Stack<Integer> stack = new Stack<Integer>();
        for(int  i=0;i<arr.length;i++){
            stack.push(i);
        }
        while(stack.size()>=2){
            int j = stack.pop();
            int i = stack.pop();

            if(arr[i][j]==1)stack.push(j);
            else stack.push(i);
        }
        int potenial = stack.pop();
        for(int i=0;i<arr.length;i++){
            if(i!=potenial){
                if(arr[i][potenial]==0 || arr[potenial][i]==1){
                    return -1;
                }
            }
        }
        return potenial;
    }
    public static void main(String[] args) {
        int arr[][] = {{0,1,1,1},{1,0,1,0},{0,0,0,0},{1,1,1,0}};
        System.out.println(celebrity(arr));
    }
}
