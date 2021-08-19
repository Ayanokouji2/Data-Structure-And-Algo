package Java.Collection_FrameWork.Stack;
// *Pepcoding/GfG
import java.util.Stack;

public class StockSpan {
    public static int[] solve(int[] arr){
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        ans[0] = 1;
        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                stack.pop();
                
            }
            if(stack.isEmpty()){
                ans[i] =i+1;
            }
            else{
                ans[i] = i- stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        arr=solve(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
