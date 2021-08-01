package Java.Collection_FrameWork.LinkedList;

import Java.LeetCode.AddTwoNum;
import Java.LeetCode.AddTwoNum.ListNode;

public class removeKfromlist {
    static ListNode  removeKFromList(ListNode l, int k) {
        if(l == null) return null;
        while(l.next!=null && l.val==k){
            l=l.next;
        }
        ListNode temp =l;
        while(temp!=null && temp.next!=null){
            if(temp.next.val==k){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;  
            }
        }
        return l;
    }
    public static void main(String[] args) {
        AddTwoNum list = new AddTwoNum();
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3);
        ListNode l2 = new ListNode();
        l2 = removeKFromList(list.head,3);
        l2.print();
    }
}
