package revision.tree;

public class TreeTraversal {
	
	public static void main(String args[]) {
		Node node = createNode();
		System.out.println("PreOrder ");
		preorderTraversal(node);
		System.out.println("\n InOrder ");
		inorderTraversal(node);
		System.out.println("\n PostOrder ");
		postorderTraversal(node);
		
	}
	
	private static void preorderTraversal(Node node) {
		if(node == null)
			return;
		System.out.printf(node.getValue() + " ");
		preorderTraversal(node.leftNode);
		preorderTraversal(node.rightNode);
	}
	
	private static void inorderTraversal(Node node) {
		if(node == null)
			return;
		inorderTraversal(node.leftNode);
		System.out.printf(node.getValue() + " ");
		inorderTraversal(node.rightNode);
	}
	
	private static void postorderTraversal(Node node) {
		if(node == null)
			return;
		postorderTraversal(node.leftNode);
		postorderTraversal(node.rightNode);
		System.out.printf(node.getValue() + " ");
	}

	private static Node createNode() {
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		Node g = new Node("g");
		Node h = new Node("h");
		Node i = new Node("i");
		Node j = new Node("j");
		Node k = new Node("k");
		
		a.leftNode = b;
		a.rightNode = g;
		b.leftNode = c;
		b.rightNode = f;
		c.leftNode = d;
		c.rightNode = e;
		g.leftNode = h;
		g.rightNode = k;
		h.leftNode = i;
		h.rightNode = j;
		return a;
	}
	
	
}
