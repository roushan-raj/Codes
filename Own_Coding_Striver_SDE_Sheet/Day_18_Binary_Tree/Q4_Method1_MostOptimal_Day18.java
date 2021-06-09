
public class Q4_Method1_MostOptimal_Day18 {
	
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
	
//	public int checkHeightBalance(Node root) {
//		if(root == null)
//			return 0;
//		
//		if(root.left == null && root.right == null)
//			return 1;
//		
//		int lh = checkHeightBalance(root.left);
//		int rh = checkHeightBalance(root.right);
//		
//		if(lh == -1 || rh == -1 || Math.abs(lh - rh) > 1)
//			return -1;
//		
//		return Math.max(lh, rh) + 1;
//	}
//	
//	public boolean driverFunction(Node root) {
//		if(checkHeightBalance(root) == -1) {
//			return false;
//		}
//		return true;
//	}
	
	public int checkHeightBalance(Node root) {
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
			return 1;
		
		int lh = checkHeightBalance(root.left);
		if(lh == -1)
			return -1;
		
		int rh = checkHeightBalance(root.right);
		if(lh == -1)
			return -1;
		
		if(Math.abs(lh - rh) > 1)
			return -1;
		
		return Math.max(lh, rh) + 1;
	}
	
	public boolean driverFunction(Node root) {
		if(checkHeightBalance(root) == -1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Q4_Method1_MostOptimal_Day18 ob = new Q4_Method1_MostOptimal_Day18();
		
		Node root = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		Node g = ob.new Node(7);
		Node h = ob.new Node(9);
		
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		f.right = g;
		c.left = h;
		
		System.out.println(ob.driverFunction(root));
	}
}
