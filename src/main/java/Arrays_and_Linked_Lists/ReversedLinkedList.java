package Arrays_and_Linked_Lists;

import Arrays_and_Linked_Lists.LinkedList.Node;

public class ReversedLinkedList {

//	Given a singly linked list, return another linked list that is the reverse of the first.
	
	public static LinkedList reverseList(LinkedList list) {
		LinkedList result = new LinkedList();
		Node currNode = list.head;
		Node prev = null;
		while(currNode!=null) {
			//1.using prepend to Head
			//result = LinkedList.prependToHead(result, currNode.val);
			//2. new impl
			result.head = new Node(currNode.val);
			result.head.next = prev;
			prev = result.head;
			currNode = currNode.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		LinkedList.insert(list, 1);
		LinkedList.insert(list, 15);
		LinkedList.insert(list, 35);
		LinkedList.insert(list, 45);
		System.out.println("original List:");
		printList(list);
		reverseList(list);
		System.out.println("reversed List: ");
		printList(reverseList(list));
	}
	
	private static void printList(LinkedList list) {
		Node currNode = list.head;

		while (currNode != null) {
			System.out.print(currNode.val + " ");
			currNode = currNode.next;
		}

	}

}
