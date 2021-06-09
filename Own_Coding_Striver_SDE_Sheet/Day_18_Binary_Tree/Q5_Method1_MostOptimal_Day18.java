
public class Q5_Method1_MostOptimal_Day18 {
	
	class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public Node lca(Node node, int p, int q) {
		if(node == null)
			return null;
		
		if(node.data == p || node.data == q)
			return node;
		
		Node left = lca(node.left, p, q);
		Node right = lca(node.right, p, q);
		
		if(left != null && right != null) 
			return node;
		
		else if (left != null) 
			return left;
		
		else 
			return right;
	}

	public static void main(String[] args) {
		Q5_Method1_MostOptimal_Day18 ob = new Q5_Method1_MostOptimal_Day18();
		
		Node root = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		//Node g = ob.new Node(7);
		
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		//f.left = g;
		
		Node lcaElement = ob.lca(root, 4, 3);
		System.out.println(lcaElement.data);
	}
}
