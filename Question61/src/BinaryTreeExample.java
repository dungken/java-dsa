import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeExample {
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	// Recursive solution
	public void preorderRecurtion(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorderRecurtion(root.left);
			preorderRecurtion(root.right);
		}
	}

	// Iterative solution

	public void preorderIterative(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(root);

		while (!st.empty()) {
			TreeNode n = st.pop();
			System.out.printf("%d ", n.data);

			if (n.right != null) {
				st.push(n.right);
			}
			if (n.left != null) {
				st.push(n.left);
			}
		}
	}

	// Create treenode

	public static TreeNode createBinaryTree() {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		return rootNode;
	}

	// Level order traversal of binary tree?

	public void levelOrderTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<BinaryTreeExample.TreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}

	public static void printArray(int[] arr, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	// Print all paths from root to leaf in binary tree.
	public void printAllPathsToLeaf(TreeNode root, int[] path, int len) {
		if (root == null)
			return;
		path[len] = root.data;
		len++;

		if (root.left == null && root.right == null) {
			printArray(path, len);
			return;
		}

		printAllPathsToLeaf(root.left, path, len);
		printAllPathsToLeaf(root.right, path, len);
	}
	

	public static void main(String[] args) {
		BinaryTreeExample bi = new BinaryTreeExample();

		// Create a binary tree
		TreeNode rootNode = createBinaryTree();
		bi.printAllPathsToLeaf(rootNode, new int[1000], 0);

	}

}
