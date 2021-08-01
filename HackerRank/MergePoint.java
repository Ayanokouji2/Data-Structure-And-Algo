package Java.HackerRank;
// import com.google.common.collect.Sets;
import Java.Collection_FrameWork.LinkedList.MakingList.Node;
import Java.Collection_FrameWork.LinkedList.MakingList;


public class MergePoint {
  
    
    static int findMergeNode(Node<Integer> head1,int num, Node<Integer> head2,int number ) {
        Node<Integer> temp1 = head1.next;
        Node<Integer> temp2 = head2.next;
        int c = number-1;
        int v = num-1;
        if(c==v){
            while(temp1!=null && temp2!=null){
                if(temp1.data == temp2.data){
                    return temp1.data;
                }
                temp1=temp1.next;
                temp2 = temp2.next;
            }
        }else return 0;
        return 0;
    }

    public static void main(String[] args) {
        MakingList<Integer> shi = new MakingList<>();
        // shi.add(45);
        shi.add(22);
        shi.add(10);
        shi.add(55);
        shi.add(40);
        MakingList<Integer> shiv = new MakingList<>();
        shiv.add(11);
        shiv.add(10);
        shiv.add(55);
        shiv.add(40);
        int num1 =shiv.sizeof();
        int num2 =shi.sizeof();
        int m = findMergeNode(shiv.head,num2,shi.head,num1);
        System.out.println(m);
    }
}
