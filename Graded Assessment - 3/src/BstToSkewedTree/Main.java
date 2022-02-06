package BstToSkewedTree;

public class Main {
	public Node node;
	public static Node prevNode = null;
	public static Node headNode = null;

	static void flattenBstToSkewed(Node root, int order) { // Function to make BST into Skewed tree in increasing order

		if (root == null) { // Base Case
			return;
		}

		if (order > 0) {
			flattenBstToSkewed(root.right, order);
		} else {
			flattenBstToSkewed(root.left, order);
		}

		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			flattenBstToSkewed(leftNode, order);
		} else {
			flattenBstToSkewed(rightNode, order);
		}
	}

	public static void traverseRightSkewed(Node root) { // Function to traverse right skewed tree
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
}
