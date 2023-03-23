package datastructureassignmentsolution2;

public class BstToLl {
	static Node head = null, pre = null;

	public static void skewConvertion(Node root) {
		if (root == null)
			return;
		skewConvertion(root.left);
		if (pre == null)
			head = root;
		else {
			pre.right = root;
			root.left = null;
		}
		pre = root;
		skewConvertion(root.right);
	}

	public static void PrintSkewBST() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.right;
		}

	}
}
