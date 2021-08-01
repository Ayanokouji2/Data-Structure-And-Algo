package Java.Collection_FrameWork.Queue;

import java.util.*;

public class KLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = in.nextInt();
        System.out.println("Enter the Elements in Array");
        int[] arr = new int[size];
        for (int i = 0; i <size;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the value of K");
        int k = in.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <size;i++){
            if(i < k){
                pq.add(arr[i]);
            }
            else{
                if(pq.peek() < arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(pq);
        Collections.sort(ans, Collections.reverseOrder());
        for(int x : ans){
            System.out.print(x +" ");
        }
        in.close();
    }
}
