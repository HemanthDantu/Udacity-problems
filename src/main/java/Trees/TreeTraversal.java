package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Trees.CreateBinaryTree.BinaryTree;
import Trees.CreateBinaryTree.TreeNode;

public class TreeTraversal {

	public static List<Integer> inOrderTraversalRecursive(TreeNode root, List<Integer> result) {
		if (root == null)
			return result;

		inOrderTraversalRecursive(root.left, result);
		result.add(root.val);
		inOrderTraversalRecursive(root.right, result);

		return result;
	}

	public static List<Integer> inOrderTraversalIterative(TreeNode root, List<Integer> result) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			result.add(root.val);
			root = root.right;
		}
		return result;
	}

	public static List<Integer> preOrderTraversalRecursive(TreeNode root, List<Integer> result) {

		if (root == null)
			return result;

		result.add(root.val);
		preOrderTraversalRecursive(root.left, result);
		preOrderTraversalRecursive(root.right, result);

		return result;
	}

	public static List<Integer> preOrderTravesalIterative(TreeNode root, List<Integer> result) {
		Stack<TreeNode> stack = new Stack<TreeNode>();

		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				result.add(root.val);
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			root = root.right;
		}
		return result;
	}

	public static List<Integer> postOrderTraversalRecursive(TreeNode root, List<Integer> result) {
		if (root == null)
			return result;

		postOrderTraversalRecursive(root.left, result);
		postOrderTraversalRecursive(root.right, result);
		result.add(root.val);

		return result;
	}

	public static List<Integer> postOrderTraversalIterative(TreeNode root, List<Integer> result) {
		Stack<TreeNode> stack = new Stack<TreeNode>();

		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				result.add(0, root.val);
				root = root.right;
			}
			root = stack.pop();

			root = root.left;
		}
		return result;
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree(15);
		TreeNode root = binaryTree.root;
		root.setLeft(new TreeNode(10));
		root.setRight(new TreeNode(22));
		root.left.setLeft(new TreeNode(4));
		root.left.setRight(new TreeNode(12));
		root.right.setLeft(new TreeNode(18));
		root.right.setRight(new TreeNode(24));

		System.out.println(inOrderTraversalRecursive(binaryTree.root, new ArrayList<Integer>()));
		System.out.println(inOrderTraversalIterative(root, new ArrayList<Integer>()));

		System.out.println(preOrderTraversalRecursive(root, new ArrayList<Integer>()));
		System.out.println(preOrderTravesalIterative(root, new ArrayList<Integer>()));

		System.out.println(postOrderTraversalRecursive(root, new ArrayList<Integer>()));
		System.out.println(postOrderTraversalIterative(root, new ArrayList<Integer>()));

	}

}
