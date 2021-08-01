package Java.Collection_FrameWork.Queue;

public class MyDeque<E> {
    Node<E> head,tail;
    public static class Node<E>{
        E data;
        Node<E> next,prev;
        public Node (E value) {
            data = value;
            next = prev = null;
        }
    }

    public void addrear(E data){
        Node<E> toadd =  new Node<>(data);
        if(head==null){
            head = tail = toadd;
            return; 
        }
        tail.next = toadd;
        toadd.prev = tail;
        tail = toadd;
    }

    public void removerear(){
        if(tail==null){
            tail = head = null;
            System.out.println("No Element to remove");
            return ;
        }
        else{
            Node<E> temp = tail;
            tail = tail.prev;
            temp.prev = null;
            System.out.println("Removed Element from back: " + temp.data);
        }    
    }

    public void addfront(E data){
        Node<E> toadd = new Node<>(data);
        if(head==null){
            head = tail = toadd;
            return;
        }
        head.prev = toadd;
        toadd.next = head;
        head = toadd;
    }

    public void removefront(){
        if(head==null){
            tail = head = null;
            System.out.println("No Element to remove");
            return;
        }
        Node<E> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("Removed Element from front: " + temp.data);
    }

    public void print(){
        if(head==null){
            head = tail = null;
            System.out.println("No Element to print");
            return;
        }
        Node<E> temp = head;
        while(temp!= null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public E getfront(){
        if(head==null){
            tail = head = null;
            return null;
        }
        E temp =head.data;
        return temp;
    }

    public E getrear(){
        if(tail==null){
            tail = head = null;
            return null;
        }
        E temp =tail.data;
        return temp;
    }
    public static void main(String[] args) {
        MyDeque<Integer> md = new MyDeque<>();
        md.addrear(1);
        md.addrear(2);
        md.addfront(-1);
        md.addfront(0);
        md.print();
        System.out.println(md.getfront());
        md.removefront();
        System.out.println(md.getrear());
        md.removerear();

    }
}
