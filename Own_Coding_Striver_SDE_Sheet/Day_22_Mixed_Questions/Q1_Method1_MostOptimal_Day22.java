
public class Q1_Method1_MostOptimal_Day22 {
	
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	/////////////////// Function code //////////////////
	
	public TreeNode binaryTreeToDLL(TreeNode root) {
		TreeNode head = null;
		TreeNode prev = null;
		int f = 0;
		convertToDLL(root, head, prev, f);
		return head;
	}
	
	public void convertToDLL(TreeNode node, TreeNode head, TreeNode prev, int f) {
		if(node == null) return;
		
		convertToDLL(node.left, head, prev, f);
		
		if(f == 0) {
			f = 1;
			head = node;
			prev = node;
		}
		else {
			prev.right = node;
			prev.right.left = prev;
			prev = node;
		}
		
		convertToDLL(node.right, head, prev, f);
	}

	public static void main(String[] args) {
		Q1_Method1_MostOptimal_Day22 ob = new Q1_Method1_MostOptimal_Day22();
		
		TreeNode root = ob.new TreeNode(8);
		TreeNode b = ob.new TreeNode(6);
		TreeNode c = ob.new TreeNode(15);
		TreeNode d = ob.new TreeNode(2);
		TreeNode e = ob.new TreeNode(7);
		TreeNode f = ob.new TreeNode(20);
		TreeNode g = ob.new TreeNode(5);
		
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		d.right = g;
	}

}
