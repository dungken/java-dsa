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

	// Spiral/Zigzag level order traversal of binary tree

	public void spriralLevelOrderTraversal(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> stack = new Stack<BinaryTreeExample.TreeNode>();
		stack.push(root);

		boolean directionflag = false;
		while (!stack.isEmpty()) {
			Stack<TreeNode> tempStack = new Stack<BinaryTreeExample.TreeNode>();

			while (!stack.isEmpty()) {
				TreeNode tempNode = stack.pop();
				System.out.print(tempNode.data + " ");

				if (!directionflag) {
					if (tempNode.left != null)
						tempStack.push(tempNode.left);
					if (tempNode.right != null)
						tempStack.push(tempNode.right);
				} else {
					if (tempNode.right != null)
						tempStack.push(tempNode.right);
					if (tempNode.left != null)
						tempStack.push(tempNode.left);
				}
			}
			directionflag = !directionflag;

			stack = tempStack;
		}
	}

	// Print leaf nodes of binary tree?
	public void printLeafNodesUsingRecursive(TreeNode root) {
		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {
			System.out.println(root.data + " ");
		}
		printLeafNodesUsingRecursive(root.left);
		printLeafNodesUsingRecursive(root.right);
	}

	public void printLeafNodesUsingIterative(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<BinaryTreeExample.TreeNode>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode curr = stack.pop();
			if (curr.left == null && curr.right == null) {
				System.out.println(curr.data + " ");
			}
			if (curr.right != null)
				stack.push(curr.right);
			if (curr.left != null)
				stack.push(curr.left);
		}
	}

	// Count leaf nodes of binary tree.

	public int countLeafNodesUsingRecurstion(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null) {
			return 1;
		} else {
			return countLeafNodesUsingRecurstion(root.left) + countLeafNodesUsingRecurstion(root.right);
		}
	}

	
	public int countLeafNodesUsingIteration(TreeNode root) {
		int count = 0;
		if (root == null) {
			return count;
		}

		Stack<TreeNode> stack = new Stack<BinaryTreeExample.TreeNode>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode curr = stack.pop();
			if (curr.left == null && curr.right == null) {
				++count;
			}
			if (curr.right != null)
				stack.push(curr.right);
			if (curr.left != null)
				stack.push(curr.left);
		}

		return count;
	}

	public static void main(String[] args) {
		BinaryTreeExample bi = new BinaryTreeExample();

		// Create a binary tree
		TreeNode rootNode = createBinaryTree();
		//
		int countLeafNode1 = bi.countLeafNodesUsingRecurstion(rootNode);
		int countLeafNode2 = bi.countLeafNodesUsingIteration(rootNode);

		System.out.println(countLeafNode1);
		System.out.println(countLeafNode2);
	}

}
