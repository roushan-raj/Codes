
public class Q2a_Method1_MostOptimal_Day18 {
	
	/////////////// Recursive Approach to find Height of Binary Tree ///////////
	
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
	
	public int heightOfBinaryTree(Node node) {
		if(node == null) {
			return -1;
		}
		
		int lh = heightOfBinaryTree(node.left);
		int rh = heightOfBinaryTree(node.right);
		
		return Math.max(lh, rh) + 1;
	}

	public static void main(String[] args) {
		Q2a_Method1_MostOptimal_Day18 ob = new Q2a_Method1_MostOptimal_Day18();
		
		Node root = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		
		System.out.println(ob.heightOfBinaryTree(root));
	}
}
