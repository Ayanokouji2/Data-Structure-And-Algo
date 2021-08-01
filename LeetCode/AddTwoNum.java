package Java.LeetCode;


public class AddTwoNum {
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
        public ListNode reverse() {
            ListNode curr = this;
            ListNode prev = null;
            ListNode After;
            while(curr!=null) {
                After = curr.next;
                curr.next = prev;
                prev = curr;
                curr = After;
            }
            return prev;
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

    public void print() {
		ListNode temp = this.head;
		System.out.print("[ ");
		while(temp!= null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println("NULL ]");
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode  ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;
        while (l1 != null || l2 != null)
        {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum/10;
            curr.next  = new ListNode(sum%10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0)
        {
            curr.next = new ListNode(carry);
        }
        return ans.next;
    }

    public static ListNode rearrangeing(ListNode head){
        // Arrange Node in Ascending Order
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val%2!=0){
                if(temp.next.val%2==0){
                    temp.next = temp.next.next;
                    temp.next.next.next = temp.next;
                    temp.next.next = temp.next.next.next;
                }
                else{
                    if(temp.next.next.val%2==0){
                        temp.next = temp.next.next;
                        temp.next.next = temp.next;
                    }
                    else temp = temp.next;
                }
            }

            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args) {
        AddTwoNum l1 = new AddTwoNum();
        l1.add(3);
        l1.add(6);
        AddTwoNum l2 = new AddTwoNum();
        l2.add(7);
        ListNode l3 = addTwoNumbers(l1.head,l2.head);
        l3 = l3.reverse();
        l3.print();
        AddTwoNum rearrange = new AddTwoNum();
        rearrange.add(1);
        rearrange.add(2);
        rearrange.add(3);
        rearrange.add(4);
        rearrange.add(5);
        rearrange.add(6);
        ListNode l5 = rearrangeing(rearrange.head);
        l5.print();
    }
}
