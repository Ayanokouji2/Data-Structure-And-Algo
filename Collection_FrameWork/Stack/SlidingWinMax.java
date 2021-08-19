package Java.Collection_FrameWork.Stack;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// Pepcoding and GFG(Maximum of All subarray)
public class SlidingWinMax {
    static int[] WindowMaximum(int a[],int key){ //Alternative Method.
        
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
        int[] ans = new int[rightNG.length-key+1];
        int j=0;
        for(int i=0;i<=a.length-key;i++){
        if(j<i)j=i;
        while(rightNG[j]<i+key){
            j=rightNG[j];
        }
        ans[i] = a[j];
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
        int key = 4;
        int[] res = WindowMaximum(arr,key);
        for(int val:res){
            System.out.print(val+" ");
        }
        
        in.close();
    }
   
}
