package Java.Collection_FrameWork.LinkedList;


import java.util.ArrayList;

public class MakingList<E> {
	public Node<E> head;
	// Node<E> head;
	// public MakingList(){
	// 	head = null;
	// }
	

	public static class Node<E>{
		public E data;
		public Node<E> next;
		public Node (E value) {
			data = value;
			next = null;
		}
		
	}
	
	public E remove() throws Exception {
		Node<E> temp = head;
		Node<E> prev = head;
		if(head==null) {
			throw new Exception("Cannot pop/delete from an Empty list");
		}
		if(temp.next == null) {
			prev.data =temp.data;
			head = null;
			return prev.data;
		}
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp.next==null) {
			prev.next = null;
		}
		return temp.data;
	}

	public void add(E data) {
		Node<E> temp = head;
		Node<E> toad = new Node<>(data);
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
		Node<E> temp = head;
		System.out.print("[ ");
		while(temp!= null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("NULL ]");
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	
	public void delete(E value){
		Node<E> temp = head;
		Node<E> previous =head;
		if(temp.data==value) {
			head=temp.next;
		}
		while(temp.next != null) {
			if(temp.data == value) {
				previous.next = temp.next;
				break;
			}
			previous = temp;
			temp = temp.next;
		}
		if(temp.next==null) {
			previous.next = null;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int sizeof() {
		Node<E> temp = head;
		int size=0;
		while(temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
	public void insert(int Index, E value) {
		Node<E> toinsert = new Node<>(value);
		Node<E> temp = head;
		Node<E> previous = head;
		int i=0;
		if(Index==0) {
			this.head.data= value;
			toinsert.next = head;
		}
		else {
		while(temp!=null) {
			if(Index==i) {
				previous.next = toinsert;
				toinsert.next = temp;
				break;
			}
			i++;
			previous = temp;
			temp = temp.next;
		    }
		}
	}
	
	public void addAll(MakingList<E> X) {
		Node<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = X.head;
	}
	
	public void Erase() {
		head=null;
	}
	
	public void deleteAll(MakingList<E> X) {
		Node<E> temp = X.head;
		while(temp!=null) {
			delete(temp.data);
			temp = temp.next;
		}
	}
	
	public void get(int Index) {
		Node<E> temp = head;
		int i=0;
		E g=null;
		while(temp!=null) {
			if(Index == i) {
				g=temp.data;
				break;
			}
			i++;
			temp = temp.next;
		}
		System.out.println(g);
	}
	
	public void search(E value) {
	    Node<E> temp =head;
		int g=0;
		if(head==null) {
			System.out.println("No elements in the List");
		}else {
			while(temp!=null) {
				if(temp.data==value) {
					g++;
					break;
				}
				temp = temp.next;
			}
			if(g==0) {
				System.out.println("false");
			}else System.out.println("true");
		}
	}
	
	public void pop() {
		Node<E> temp = head;
		if(head==null) {
			System.out.println("No Element in the list to pop");
		}else {
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	// public ArrayList<E> reverse() {
	// 	ArrayList<E> arr =toArray();
	// 	ArrayList<E> rev = new ArrayList<>();
	// 	for(int i=arr.size()-1;i>=0;i--) {
	// 		rev.add(arr.get(i));
	// 	}
	// 	return rev;
	// }

	// static MakingList.Node<Integer> removeDupli(Node<Integer> head, int k) {
	// 	if(head==null) return null;
	// 	if(head.data==k && head.next.data==k && head.next.next==null)return null;
	// 	if(head.data==k) {
	// 		head =head.next;
	// 	}
	// 	Node<Integer> temp = head;
	// 	Node<Integer> prev = head;
	// 	while(temp!=null){
	// 		if(temp.data == k)
	// 			prev.next = temp.next;
			
	// 		prev = temp;
	// 		temp = temp.next ;   
	// 	}
	// 	Node<Integer> tem = head;
	// 	System.out.print("[ ");
	// 	while(tem!= null) {
	// 		System.out.print(tem.data + "-->");
	// 		tem = tem.next;
	// 	}
	// 	System.out.println("NULL ]");
	// 	return head;
	// }
	
	public void reverse(Node<E> head){
		Node<E> prev = null;
		Node<E> current = head;
		Node<E> after;
		while(current!=null){
			after = current.next;
			current.next = prev;
			prev = current;
			current = after;
		}
		head = prev;
	}

	public E peek() {
		Node<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
    public ArrayList<E> toArray() {
		Node<E> temp = head;
		ArrayList<E> arr = new ArrayList<>();
		while(temp!=null) {
			arr.add(temp.data);
			temp = temp.next;
		}
		return arr;
	}
	
    public static void main(String[] args) throws Exception {

		 MakingList<String> ml = new MakingList<>();
		 
		 ml.add("monu");
		 ml.add("Sharma");
		 ml.insert(0, "Shivam");
		 ml.print();
		 MakingList<String> lm = new MakingList<>();
		 lm.add("Sujal");
		 lm.add("Kumar");
		 lm.addAll(ml);
		 lm.delete("sharma");
		 lm.print();
		 lm.deleteAll(ml);
		 lm.print();
		//  lm.reverse();
		 lm.print();
		 lm.sizeof();
		 MakingList<Integer> l = new MakingList<>();
		 l.add(1);
		 l.add(1);
		 l.add(5);
		//  l.add(7);
		//  l.add(1);
		//  removeDupli(l.head,1);
		//  s.print();
		// //  System.out.println(lm);
		//  ArrayList<String> arr = lm.toArray();
		//  System.out.println(arr);
		//  String lll= lm.remove();
		//  System.out.println(lll);
		//  lll = lm.peek();
		//  System.out.println(lll);
		 
		//  lm.print();
	}

}

