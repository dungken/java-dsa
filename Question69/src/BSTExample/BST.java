package BSTExample;

public class BST {
	// Tao cau truc cua moi node
	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	// Tim kiem 1 node trong cay nhi phan tim kiem
	public static boolean search(TreeNode root, TreeNode nodeToBeSearched) {
		if (root == null)
			return false;
		if (root.data == nodeToBeSearched.data)
			return true;
		boolean result = false;

		if (root.data < nodeToBeSearched.data)
			result = search(root.right, nodeToBeSearched);
		if (root.data > nodeToBeSearched.data)
			result = search(root.left, nodeToBeSearched);

		return result;
	}

	// Them node moi vao cay nhi phan tim kiem
	public static TreeNode insert(TreeNode root, TreeNode nodeToBeInserted) {
		if (root == null) {
			root = nodeToBeInserted;
			return root;
		}

		if (root.data > nodeToBeInserted.data) {
			if (root.left == null) {
				root.left = nodeToBeInserted;
			} else {
				insert(root.left, nodeToBeInserted);
			}
		} else if (root.data < nodeToBeInserted.data) {
			if (root.right == null) {
				root.right = nodeToBeInserted;
			} else {
				insert(root.right, nodeToBeInserted);
			}
		}

		return root;
	}

	// In cay nhi phan tim kiem
	public static void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	// Tao cay nhi phan tim kiem
	public static TreeNode createBST() {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);
		TreeNode node5 = new TreeNode(5);
		TreeNode node55 = new TreeNode(55);

		insert(null, rootNode);
		insert(rootNode, node20);
		insert(rootNode, node10);
		insert(rootNode, node30);
		insert(rootNode, node60);
		insert(rootNode, node50);
		insert(rootNode, node70);
		insert(rootNode, node5);
		insert(rootNode, node55);

		return rootNode;

	}

	public static void main(String[] args) {
		// Tao BST
		TreeNode rootNode = createBST();
		// Tim kiem node55 trong BST
		TreeNode node55 = new TreeNode(55);
		System.out.println("Search node 55: " + search(rootNode, node55));
		// Tim kiem node7 trong BST
		TreeNode node7 = new TreeNode(7);
		System.out.println("Search node 7: " + search(rootNode, node7));
		// Them node 13 vao BST
		TreeNode node13 = new TreeNode(13);

		TreeNode root = insert(rootNode, node13);
		System.out.print("Inorder traversal: ");
		inOrder(root);
	}

}
