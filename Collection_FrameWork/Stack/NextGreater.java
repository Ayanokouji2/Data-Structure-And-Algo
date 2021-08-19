package Java.Collection_FrameWork.Stack;
// Pepcoding
import java.util.*;
public class NextGreater {
    public static int[] getNextGreater(int[] arr){          //NGE on the right side.
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length-1);
        ans[ans.length-1] = Integer.MAX_VALUE;
        for(int i = arr.length-2; i>=0;i--){
            while(!stack.isEmpty() && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = Integer.MAX_VALUE;
            }
            else ans[i] = arr[stack.peek()];
            stack.push(i);
            // System.out.println(stack);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        // int[] res = getNextGreater(arr);
        // for(int val:res){
        //     System.out.print(val+" ");
        // }
        System.out.println();
        int[] res = NGE(arr);
        for(int val:res){
            System.out.print(val+" ");
        }
        in.close();
    }
    static int[] NGE(int a[]){ //Alternative Method.
        // code
        int[] rightNG = new int[a.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        Arrays.fill(rightNG,a.length);
        for(int i=1;i<a.length;i++){
            while(!stack.isEmpty() && a[i]>=a[stack.peek()]){
                rightNG[stack.peek()] = i;
                stack.pop();
            }
            stack.push(i);
        }

        int j=0;
        for(int i=0;i<=a.length-4;i++){
        if(j<i)j=i;
        while(rightNG[j]<i+4){
            j=rightNG[j];
        }
        System.out.print(a[j]+" ");
    }
    System.out.println();
        return rightNG;
    }
}
