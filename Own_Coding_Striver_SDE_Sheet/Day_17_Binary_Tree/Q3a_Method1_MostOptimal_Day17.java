
public class Q3a_Method1_MostOptimal_Day17 {
	
	//////////////// Post-Order Recursive Approach ///////////////
	
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
	
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}

	public static void main(String[] args) {
		Q3a_Method1_MostOptimal_Day17 ob = new Q3a_Method1_MostOptimal_Day17();
		
		Node root = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		Node g = ob.new Node(7);
		
		root.left = b;
		root.right = g;
		b.left = c;
		b.right = d;
		c.left = e;
		e.right = f;
		
		ob.postOrder(root);
	}
}
