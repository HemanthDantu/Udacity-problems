package Trees;

import Trees.CreateBinaryTree.TreeNode;

/*Given the root of a binary tree, find the diameter.

Note: Diameter of a Binary Tree is the maximum distance between any two nodes

*You can use the following function to test your code with custom test cases. 
*The function convert_arr_to_binary_tree takes an array input representing level-order traversal of the binary tree.

The above tree would be represented as arr = [1, 2, 3, 4, None, 5, None, None, None, None, None]

Notice that the level order traversal of the above tree would be [1, 2, 3, 4, 5].

Note the following points about this tree:

None represents the lack of a node. For example, 2 only has a left node; therefore, the next node after 4 (in level order) is represented as None
Similarly, 3 only has a left node; hence, the next node after 5 (in level order) is represted as None.
Also, 4 and 5 don't have any children. Therefore, the spots for their children in level order are represented by four None values (for each child of 4 and 5).*/
public class DiameterOfBinaryTree {
	private static int diameter;

	public static int diameterOfBinaryTree(TreeNode root) {
		diameter = 0;
		longestPath(root);
		return diameter;
	}

	private static int longestPath(TreeNode root) {

		if (root == null)
			return 0;

		int leftPath = longestPath(root.left);
		int rightPath = longestPath(root.right);

		diameter = Integer.max(diameter, leftPath + rightPath);

		return Math.max(leftPath, rightPath) + 1;

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.setLeft(new TreeNode(10));
		root.setRight(new TreeNode(22));
		root.left.setLeft(new TreeNode(4));
		root.left.setRight(new TreeNode(12));
		root.right.setLeft(new TreeNode(18));
		root.right.setRight(new TreeNode(24));

		System.out.println(diameterOfBinaryTree(root));
	}

}
