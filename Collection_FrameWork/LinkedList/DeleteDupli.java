package Java.Collection_FrameWork.LinkedList;


public class DeleteDupli{
    public static SinglyLinkedListNode head;
   public static class SinglyLinkedListNode{
       int data;
       SinglyLinkedListNode next;
       public SinglyLinkedListNode(int data){
           this.data = data;
           next = null;
       }
   }
   public void removeDuplicates(){
    if(head == null || head.next == null) {
        return;
    }
        SinglyLinkedListNode after = head.next;
        SinglyLinkedListNode current = head;
        // while(temp != null){
        //     if(temp.data!=current.data){
        //         current.next = temp.next;
        //         current = current.next;
        //         temp = temp.next;
        //     }
        //     else{
        //         temp = temp.next;
        //     }
        // }
        while(after!=null){
            if(current.data == after.data){
                current.next = after.next;
                after = after.next;
            }
            else{
                current = current.next;
                after = after.next;
            }
            
        }
   }
   public void add(int data) {
    SinglyLinkedListNode temp = head;
    SinglyLinkedListNode toad = new SinglyLinkedListNode(data);
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
    SinglyLinkedListNode temp = head;
    System.out.print("[ ");
    while(temp!= null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println("]");
}    

    public static void main(String[] args) {
        DeleteDupli x = new DeleteDupli();
        x.add(1);
        x.add(2);
        x.add(2);
        x.add(3);
        x.add(3);
        x.add(3);
        x.add(3);
        x.add(7);
        x.add(7);
        x.removeDuplicates();
        x.print();      
    }
}