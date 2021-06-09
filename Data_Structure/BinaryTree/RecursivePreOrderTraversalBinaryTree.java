
public class RecursivePreOrderTraversalBinaryTree {
	
	private TreeNode root;
	                                                             // Pre-order means 
	private class TreeNode {                              // root
		private TreeNode left;                              // left
		private TreeNode right;                            // right
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(10);
		TreeNode third = new TreeNode(12);
		TreeNode fourth = new TreeNode(13);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
	}
	
	public void preOrder (TreeNode root) {
		if (root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {
		 
		RecursivePreOrderTraversalBinaryTree ob = new RecursivePreOrderTraversalBinaryTree();
		ob.createBinaryTree();
		ob.preOrder(ob.root);

	}

}
