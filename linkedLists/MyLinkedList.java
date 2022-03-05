package linkedLists;

public class MyLinkedList<E> {
	
	Node<E> head;
	
	public void add(E data) {            // method
		Node<E> toAdd = new Node<E>(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {  // traversing in LinkedList
			temp = temp.next;       // as we have to move to last to append element
		}
		
		temp.next = toAdd;          // added the node at end
	}
	
	void print() {                  // method
		Node<E> temp = head;
		while(temp != null) {  
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
//		if(head == null) {
//		return true;
//	}
//	else {
//		return false;
//	}
	}
	
	
	public E removeLast() throws Exception {  // for pop() operation (Stack)
		Node<E> temp = head;
		
		if(temp == null) {  // if the list is empty
			throw new Exception("Cannot remove last element from empty linked list");
		}
		
		if(temp.next == null) { // if the list has only one element
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null) {    // moved to 2nd last element
			temp = temp.next;    
	}
		Node<E> toRemove = temp.next;  // removing last element
		temp.next = null;
		return toRemove.data;
	}
		public E getLast() throws Exception {  // for peek() opeeation (Stack)
			
			Node<E> temp = head;
			
			if(temp == null) {  // if the list is empty
				throw new Exception("Cannot peek last element from empty linked list");
			}
			
			while(temp.next != null) {    
				temp = temp.next;    
		}
			return temp.data;
			
		}

	
	public static class Node<E> {             // class
		public E data;                        // data
		public Node<E> next;                  // reference
		
		public Node(E data) {     // constructor
			this.data = data;     
			next = null;
		}
	}

}
