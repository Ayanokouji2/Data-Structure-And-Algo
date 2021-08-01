package Java.HackerRank;

import java.util.*;

public class SlidingWindow2 {

  static class Solution{

    public int[] maxSlidingWindow(int[] arr, int k){
      
      int n = arr.length;
      Deque<Integer> array = new LinkedList<>();
      int[] ans = new int[n-k+1];
      int i=0;
      for( ;i<k;i++){
        while(!array.isEmpty() && arr[array.peekLast()] <=arr[i]){
          array.removeLast();
        }
        array.addLast(i);
      }
      for( ;i<n;i++){
        ans[i-k] = arr[array.peekFirst()];

        while(!array.isEmpty() && array.peekFirst() <= i-k){
          array.removeFirst();
        }
        while(!array.isEmpty() && arr[array.peekLast()] <=arr[i]){
          array.removeLast();
        }
        array.addLast(i);
      }
      ans[i-k] = arr[array.peekFirst()];

      return ans;
    }
  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size");
    int size = in.nextInt();
    System.out.println("Enter the Array Element");
    int[] arr = new int[size];
    for(int i = 0; i < size; i++){
      arr[i] = in.nextInt();
    }
    System.out.println("Enter the size of the window");
    int num = in.nextInt();
    Solution sol = new Solution();
    int ans[] =sol.maxSlidingWindow(arr,num);
    for(int item : ans){
      System.out.print(item+" ");
    }
    in.close();
  }  
}
