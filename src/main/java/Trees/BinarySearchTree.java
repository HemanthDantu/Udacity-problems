package Trees;

import java.util.Stack;

public class BinarySearchTree {
	public Node root;

	public class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	public void insertinBST(int val) {
		Node newNode = new Node(val);
		if (root == null) {
			root = newNode;
		}

		Node prev = null;
		Node curr = root;

		while (curr != null) {
			if (curr.val > val) {
				prev = curr;
				curr = curr.left;
			} else if (curr.val < val) {
				prev = curr;
				curr = curr.right;
			}

		}
		if (prev.val > val)
			prev.left = newNode;
		else
			prev.right = newNode;
	}

	public void inorder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		while (temp != null || !stack.isEmpty()) {
			if (temp != null) {
				stack.add(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.val + " ");
				temp = temp.right;
			}
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertinBST(15);
		bst.insertinBST(10);
		bst.insertinBST(22);
		bst.insertinBST(4);
		bst.insertinBST(12);
		bst.insertinBST(18);
		bst.insertinBST(24);
		bst.insertinBST(10);
		bst.inorder();

	}

}
