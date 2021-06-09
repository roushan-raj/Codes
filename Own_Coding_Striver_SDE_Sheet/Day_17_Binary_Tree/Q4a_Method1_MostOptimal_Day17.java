
public class Q4a_Method1_MostOptimal_Day17 {
	
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
	
	int maxLevel = 0;
	
	public void leftView(Node root, int level) {
		if(root == null) {
			return;
		}
		
		if(level >= maxLevel) {
			System.out.print(root.data + " ");
			maxLevel++;
		}
		
		leftView(root.left, level + 1);
		leftView(root.right, level + 1);
	}

	public static void main(String[] args) {
		Q4a_Method1_MostOptimal_Day17 ob = new Q4a_Method1_MostOptimal_Day17();
		
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
		
		ob.leftView(root, 0);
	}
}
