package Arrays_and_Linked_Lists;

/**
 * # Problem Statement # You are given the head of a linked list and two
 * integers, i and j. You have to retain the first i nodes and then delete the
 * next j nodes. Continue doing so until the end of the linked list. # #
 * Example: # # linked-list = 1 2 3 4 5 6 7 8 9 10 11 12 # i = 2 # j = 3 #
 * Output = 1 2 6 7 11 12
 */

public class Skip_i_Delete_j {

	public static class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	public static void insertNode(Node head, int val) {
		if (head == null) {
			head = new Node(val);
		} else {
			while (head.next != null) {
				head = head.next;
			}
			head.next = new Node(val);
		}
	}

	public static Node skipIDeleteJ(Node head, int i, int j) {
		int tempi = i;
		int tempj = j;
		Node tempHead = head;

		while (head != null) {
			while (tempi > 1 && head != null) {
				head = head.next;
				tempi--;
			}
			Node temp = head;

			while (tempj > 0 && temp != null) {
				temp = temp.next;
				tempj--;
			}
			if(temp != null)
				head.next = temp;

			tempi = i;
			tempj = j;
		}

		return tempHead;
	}

	public static void main(String args[]) {
		Node headNode = new Node(0);
		insertNode(headNode, 1);
		insertNode(headNode, 2);
		insertNode(headNode, 3);
		insertNode(headNode, 4);
		insertNode(headNode, 5);
		insertNode(headNode, 6);
		insertNode(headNode, 7);
		insertNode(headNode, 8);
		insertNode(headNode, 9);
		insertNode(headNode, 10);

		Node temp = headNode;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		
		System.out.println("After");
		Node result = skipIDeleteJ(headNode, 2, 3);
		
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}

	}

}
