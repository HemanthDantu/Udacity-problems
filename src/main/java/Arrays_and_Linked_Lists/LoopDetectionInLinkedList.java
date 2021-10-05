package Arrays_and_Linked_Lists;

import Arrays_and_Linked_Lists.LinkedList.Node;

public class LoopDetectionInLinkedList {

	public static Boolean hasLoop(LinkedList list) {
		Node slowNode = list.head;
		Node fastNode = list.head;

		while (slowNode != null && fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if (slowNode == fastNode)
				return true;

		}

		return false;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		LinkedList.insert(list, 1);
		LinkedList.insert(list, 15);
		LinkedList.insert(list, 35);
		LinkedList.insert(list, 45);
		System.out.println("Before Cycle added:" + hasLoop(list));

		list.head.next.next.next = list.head;
		System.out.println("original List:");

//		printList(list);
		System.out.println("After ading cycle: " + hasLoop(list));
	}

	private static void printList(LinkedList list) {
		Node currNode = list.head;

		while (currNode != null) {
			System.out.print(currNode.val + " ");
			currNode = currNode.next;
		}

	}

}
