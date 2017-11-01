
public class singly_linkedlist {
	
	int data;
	singly_linkedlist head = null;
	singly_linkedlist last = null;
	singly_linkedlist next = null;
	
	// Default Constructor
	public singly_linkedlist() {
		data = 0;
		head = last = null;
	}
	
	// Parameterised Constructor
	public singly_linkedlist(int value) {
		data = value;
		head = last = next = null;
	}
	
	// Append an element into linked list.
	singly_linkedlist append(int element) {
		singly_linkedlist newNode = new singly_linkedlist(element);
		
		// Edge case, check if the LinkedList is empty
		if (head == null) {
			head = last = newNode;
		}
		else {
			// Update last Node and next Node			
			last.next = newNode;
			last = newNode;
		}
			
		return newNode;
	}
	
	// Remove the last element from the linked list
	singly_linkedlist removeLast() {
		//Edge case, check if the list is empty
		if (last == null) return null;
		
		singly_linkedlist prevNode = head;
		if (prevNode == last) {
			head = last = null;
			return prevNode;
		}
		
		singly_linkedlist Node = last;
		while (prevNode.next != last) {
			prevNode = prevNode.next;
		}
		
		// Remove the last node and update
		prevNode.next = null;
		last = prevNode;
		
		return Node;
	}
	
	
	// Remove all element in the LinkedList that is greater than a target value
	void removeGreaterThanTarget(int value) {
		singly_linkedlist Node = head;
		singly_linkedlist prevNode = Node;
		
		
		while (Node != null) {
			if (Node.data > value) {
				// check whether starting Node values are greater and update head Node
				if (prevNode == Node) {
					// Edge case, check if only one Node is present
					if (Node == last) last = prevNode.next;
					head = prevNode = Node = prevNode.next;		
				} 
				else {
					// Edge case, check if only one Node is present
					if (Node == last) last = prevNode;
					prevNode.next = Node.next;
					Node = Node.next;
				}
				 
			} else {
				prevNode = Node;
				Node = Node.next;
			}
		}
		
	}
	
	void printLinkedList()
	{
		singly_linkedlist Node = head;
		while(Node != null)
		{
			System.out.print(Node.data + " ");
			Node = Node.next;
		}
		System.out.println();
	}


}
