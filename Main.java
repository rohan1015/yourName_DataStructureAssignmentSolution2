package datastructureassignmentsolution2;

public class Main {

	public static void main(String[] args) {

		Bstnode tree = new Bstnode();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		BstToLl.skewConvertion(tree.node);
		BstToLl.PrintSkewBST();

	}

}
