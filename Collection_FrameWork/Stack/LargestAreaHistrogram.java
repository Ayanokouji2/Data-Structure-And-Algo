package Java.Collection_FrameWork.Stack;

//* Pepcoding

import java.util.*;
public class LargestAreaHistrogram {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
    
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = in.nextInt();
        }
        // Left Bound Index
        int[] leftb = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        leftb[0] = -1;
        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                leftb[i] = -1;
            }
            else{
                leftb[i] = stack.peek();
            }
            stack.push(i);
        }
        // Right Bound Index
        stack = new Stack<>();
        int[] rightb = new int[arr.length];
        stack.push(arr.length-1);
        rightb[arr.length-1] = arr.length;
        for(int i= arr.length-2;i>=0;i--){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                rightb[i] = arr.length;
            }   
            else{
                rightb[i] = stack.peek();
            }
            stack.push(i);
        }
        int maxArea =0;
        for(int i =0;i<arr.length;i++){
            int width = rightb[i]-1-leftb[i];
            int heigth = arr[i];
            int area = heigth*width;
            maxArea = Math.max(area,maxArea);
        }
        System.out.println(maxArea);
        in.close();
    }
}
