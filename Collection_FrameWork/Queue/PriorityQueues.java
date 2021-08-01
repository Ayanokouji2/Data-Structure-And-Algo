package Java.Collection_FrameWork.Queue;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> sh = new PriorityQueue<>();
        // sh.add("Shivam");
        // sh.add("Apple");
        // sh.add("Banana");
        sh.add(45);
        sh.add(1);
        sh.add(100);
        sh.add(55);
        System.out.println(sh.peek());
        System.out.println(sh);
        System.out.println(sh.remove()); //Removes in the Sorted Ordering
        System.out.println(sh.remove());
        System.out.println(sh.remove());
        System.out.println(sh.remove());        

    }    
}
