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

	// Xoa mot node trong cay nhi phan tim kiem

	public static TreeNode deleteNode(TreeNode root, int value) {
		if (root == null)
			return null;
		if (root.data > value) {
			deleteNode(root.left, value);
		} else if (root.data < value) {
			deleteNode(root.right, value);
		} else {
			// Truong hop co 2 con
			if (root.left != null && root.right != null) {
				TreeNode temp = root;
				// Tim phan tu nho nhat ben phai temp
				TreeNode minNode = minimumElement(temp.right);
				// Thay the node hien tai voi node nho nhat do
				root.data = minNode.data;
				// Xoa node do
				root.right = deleteNode(root.right, minNode.data);
			}
			// Truong hop co 1 con ben trai
			else if (root.left != null) {
				root = root.left;
			}
			// Truong hop co 1 con ben phai
			else if (root.right != null) {
				root = root.right;
			}
			// Truong hop khong co con
			else {
				root = null;
			}
		}
		return root;
	}

	// Tim kiem node nho nhat trong cay nhi phan tim kiem
	public static TreeNode minimumElement(TreeNode root) {
		if (root.left == null)
			return root;
		return minimumElement(root.left);
	}

	// Tim phan tu lon nhat trong cay nhi phan tim kiem
	public static TreeNode maximumElement(TreeNode root) {
		if (root.right == null)
			return root;
		return maximumElement(root.right);
	}

	public static void main(String[] args) {
		/*
		 * Question 71 : How can you find minimum and maximum elements in binary search
		 * tree?
		 */
		// Tao BST
		TreeNode rootNode = createBST();

		// Phan tu lon nhat trong BST
		TreeNode nodeMaximum = maximumElement(rootNode);
		System.out.println("Phan tu lon nhat la: " + nodeMaximum.data);

		// Phan tu nho nhat trong BST
		TreeNode nodeMinimum = minimumElement(rootNode);
		System.out.println("Phan tu nho nhat la: " + nodeMinimum.data);
	}

}
