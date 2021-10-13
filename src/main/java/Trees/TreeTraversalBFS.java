package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Trees.CreateBinaryTree.BinaryTree;
import Trees.CreateBinaryTree.TreeNode;

public class TreeTraversalBFS {

	public static List<Integer> treeTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		List<Integer> result = new ArrayList<>();
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			result.add(tempNode.val);
			if (tempNode.left != null)
				queue.add(tempNode.left);
			if (tempNode.right != null)
				queue.add(tempNode.right);
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

		System.out.println(treeTraversal(root));
	}

}
