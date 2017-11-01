/*
 * Time Complexity - O(n) for all the three functions
 * Space Complexity - O(1) since we are not using any extra space
 */

public class singly_linkedlist_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singly_linkedlist sll = new singly_linkedlist();
		
		sll.append(10);
		sll.append(20);
		sll.append(30);
		sll.append(-15);
		sll.append(25);
		sll.append(15);
		sll.append(-10);
		sll.printLinkedList();
		
		sll.removeLast();
		sll.removeLast();
		sll.printLinkedList();
		
		sll.removeGreaterThanTarget(25);
		sll.removeGreaterThanTarget(20);
		sll.removeGreaterThanTarget(0);
		sll.printLinkedList();
		

	}

}
