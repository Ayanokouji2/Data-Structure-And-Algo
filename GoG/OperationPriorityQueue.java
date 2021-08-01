package Java.GoG;
import java.util.*;

public class OperationPriorityQueue{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Size of the array: " );
        int N = in.nextInt();
        System.out.println("Enter the Elements ");
        for(int i = 0; i < N; i++){
            pq.add(in.nextInt());
        }
        PriorityQueue<Integer> qp = new PriorityQueue<Integer>();
        System.out.println("Enter the size of other Array");
        int M = in.nextInt();
        for(int i = 0; i <M;i++){
            qp.add(in.nextInt());
        }
        for(int i =0;i<M;i++){
            if(pq.contains(qp.poll())){
                System.out.println("1");     
                System.out.println( pq.poll());
            }
            else System.out.println("-1");;
        }
        in.close();
        
    }
}