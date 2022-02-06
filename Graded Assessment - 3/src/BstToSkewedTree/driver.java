package BstToSkewedTree;

public class driver {

	public static void main(String[] args) {

		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		int order = 0;
		Main.flattenBstToSkewed(tree.node, order);
		Main.traverseRightSkewed(Main.headNode);
	}

}
