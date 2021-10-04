package Arrays_and_Linked_Lists;

public class LinkedList {

	public Node head;

	public static class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	// Append to tail
	public static LinkedList insert(LinkedList list, int val) {
		Node newNode = new Node(val);

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node lastNode = list.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}

			lastNode.next = newNode;
		}
		return list;
	}

	// prepend to head
	public static LinkedList prependToHead(LinkedList list, int val) {
		Node newNode = new Node(val);
		newNode.next = list.head;
		list.head = newNode;

		return list;
	}

//	#   Search the linked list for a value and return the node

	public static Node search(LinkedList list, int val) {
		Node currNode = list.head;

		while (currNode != null) {
			if (currNode.val == val)
				return currNode;
			currNode = currNode.next;
		}
		return currNode;
	}

//	#   Remove a node

	public static LinkedList removeNode(LinkedList list, int val) {
		Node currNode = list.head;

		if (currNode.val == val)
			list.head = currNode.next;

		while (currNode != null) {
			if (currNode.next != null && currNode.next.val == val) {
				Node temp = currNode.next.next;
				currNode.next = temp;
			}
			currNode = currNode.next;
		}
		return list;
	}

//	#   Pop, which means to return the first node's value and delete the node from the list

	public static int pop(LinkedList list) {
		int result = list.head != null ? list.head.val : 0;
		if (list.head != null) {
			list.head = list.head.next;
		} else
			list.head = null;
		return result;
	}

	public static void main(String args[]) {
		LinkedList list = new LinkedList();

		insert(list, 1);
		insert(list, 15);
		insert(list, 35);
		insert(list, 45);

		prependToHead(list, 25);

		printList(list);

//		System.out.println("search result :" + search(list, 15).val);
//		System.out.println("search result :" + search(list, 13));
//
//		System.out.println("before removing a node :");
//		printList(list);
//		System.out.println("After removing a node :");
//		removeNode(list, 25);
//		printList(list);
//		
		System.out.println(pop(list));
		printList(list);
		System.out.println(pop(list));
		printList(list);
		System.out.println(pop(list));
		printList(list);
		System.out.println(pop(list));
		printList(list);
		System.out.println(pop(list));
		printList(list);
		System.out.println(pop(list));
		printList(list);
		System.out.println(pop(list));
		printList(list);

	}

	private static void printList(LinkedList list) {
		Node currNode = list.head;

		while (currNode != null) {
			System.out.print(currNode.val + " ");
			currNode = currNode.next;
		}

	}
}
