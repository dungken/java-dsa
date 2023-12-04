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

	// Chuyen mang da sap xep thanh cay nhi phan tim kiem can bang
	public static void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static TreeNode createBSTFromSortedArray(int[] arr, int s, int e) {
		if (s > e)
			return null;
		int m = (s + e) / 2;
		TreeNode node = new TreeNode(arr[m]);
		node.left = createBSTFromSortedArray(arr, s, m - 1);
		node.right = createBSTFromSortedArray(arr, m + 1, e);
		return node;
	}

	
	public static void main(String[] args) {
		/*
		 * Question 74 : Convert sorted array to balanced BST
		 */
		
		int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		TreeNode rootNode = createBSTFromSortedArray(arr, 0, arr.length - 1);
		preOrder(rootNode);

	}

}
