
public class Q6a_Method1_MostOptimal_Day18 {
	
	/////////////////// Recursive Approach ///////////////////
	
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
	
	public boolean checkIdenticalTree(Node node1, Node node2) {
		if(node1 == null && node2 == null) {
			return true;
		}
		
		if(node1 == null || node2 == null) {
			return false;
		}
		
		return node1.data == node2.data 
				&& checkIdenticalTree(node1.left, node2.left)
				&& checkIdenticalTree(node1.right, node2.right);
	}

	public static void main(String[] args) {
		Q6a_Method1_MostOptimal_Day18 ob = new Q6a_Method1_MostOptimal_Day18();
		
		Node root1 = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		//Node g = ob.new Node(7);
		
		root1.left = b;
		root1.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		//f.left = g;
		
		Node root2 = ob.new Node(1);
		Node p = ob.new Node(2);
		Node q = ob.new Node(3);
		Node r = ob.new Node(4);
		Node s = ob.new Node(5);
		Node t = ob.new Node(6);
		Node u = ob.new Node(7);
		
		root2.left = p;
		root2.right = q;
		p.left = r;
		p.right = s;
		q.right = t;
		t.left = u;
		
		System.out.println(ob.checkIdenticalTree(root1, root2));
	}
}
