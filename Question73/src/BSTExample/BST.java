package BSTExample;

public class BST {
	// Tao cau truc cua moi node
	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public String toString() {
			return data + "";
		}
	}

	// Tao mot node root
	public static Node root;

	public static void main(String[] args) {
		root = new Node(6);
		root.left = new Node(4);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		root.right.right = new Node(12);
		root.right.left = new Node(8);
		root.right.left.left = new Node(7);
		root.right.left.right = new Node(9);

		System.out.println(getInsucc(12));
	}

	public static int getInsucc(int data) {
		Node node = find(root, data);
		if (node.right != null) {
			return rightsmallest(node).data;
		} else {
			nextGreaterEfficient(root, data);
			return inSuc.data;
		}
	}

	public static Node find(Node node, int data) {
		if (node == null)
			return null;
		if (node.data == data)
			return node;
		Node lr = find(node.left, data);
		Node rr = find(node.right, data);

		if (lr == null && rr == null) {
			return null;
		} else if (rr == null) {
			return lr;
		} else {
			return rr;
		}
	}

	public static Node rightsmallest(Node node) {
		Node curr = node.right;

		while (curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}

	public static Node inSuc = null;

	public static void nextGreaterEfficient(Node node, int target) {
		if (node == null)
			return;
		if (node.data > target) {
			inSuc = node;
			nextGreaterEfficient(node.left, target);
		} else {
			nextGreaterEfficient(node.right, target);
		}
	}

}
