
public class Q1_Method1_MostOptimal_Day19 {
	
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
	
	int max_path_sum;
	public int maxPathSum(Node root) {
		max_path_sum = Integer.MIN_VALUE;
		getPathSum(root);
		return max_path_sum;
	}
	
	public int getPathSum(Node root) {
		if(root == null) {
			return 0;
		}
		int left = Math.max(0, getPathSum(root.left));
		int right = Math.max(0, getPathSum(root.right));
		max_path_sum = Math.max(max_path_sum, left+right+root.data);
		return Math.max(left, right) + root.data;
	}

	public static void main(String[] args) {
		Q1_Method1_MostOptimal_Day19 ob = new Q1_Method1_MostOptimal_Day19();
		
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
		
		System.out.println(ob.maxPathSum(root));
	}
}
