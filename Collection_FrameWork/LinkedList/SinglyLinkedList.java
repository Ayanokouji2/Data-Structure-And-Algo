package Java.Collection_FrameWork.LinkedList;


public class SinglyLinkedList {
    public ListNode head;
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
             this.next = next; 
        }
    

        public void print() {
            ListNode temp = this;
		    System.out.print("[ ");
		    while(temp!= null) {
			    System.out.print(temp.val + "-->");
			    temp = temp.next;
		    }
		    System.out.println("NULL ]");
        }
    }
    public void add(int data) {
		ListNode temp = head;
		ListNode toad = new ListNode(data);
		if(head == null) {
			head = toad;
			return;
		}
		else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = toad;
			return;
		}
	}


    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.add(1);
        llist.add(3);
        llist.add(7);
        SinglyLinkedList llist1 = new SinglyLinkedList();
        llist1.add(1);
        llist1.add(2);
    }
}
