import java.util.Collection;
import java.util.Collections;

class ADTDList implements DListInterface {

	Node head;
	Node tail;
	int numItems;

	// TODO: Implement list operations here

	public ADTDList() {
		numItems = 0; // declares numItems is 0
		head = null; // declares head is null
		tail = null; // declares tail is null
	} // end default constructor

	public boolean isEmpty() {
		return numItems == 0; // returns boolean to allow the checking of an empty list
	} // end isEmpty

	public int size() {
		return numItems;
	} // end size

	public Node find(int index) {
		Node curr = head;
		for (int i = 1; i < index; i++) {
			curr = curr.getNext();
		}
		return curr;
	}
	
	public void add(int index, Object item) throws ListIndexOutOfBoundsException {
		if (index >= 0 && index <= numItems) { // if statement to catch out of bounds exception
			if (index == 0 && numItems == 0) { // If index is 0, this means there is no head, so a head must be referenced
				head = null;
				Node newNode = new Node(item, head); // creates a new node
				head = newNode; // declares new node as the head of a list
				
				
			}
			
			else { // else loop for adding to any other node that is not the head
					    
				Node prev = find(index);
				Node newNode = new Node(item, prev.getNext());// declares new node
				prev.setNext(newNode); // sets next reference for previous node to the new node that has been created
			    newNode.setPrev(prev);	
			    Node next = find(index + 2);
			    newNode.setNext(next);
			    next.setPrev(newNode);
			    
			}
		} else {
			throw new ListIndexOutOfBoundsException("List index out of bounds"); // else throws an index out of bounds
																					// exception
		}

			numItems++; // add one to numItems
			
	}
	
}// end add 
	
	