
public class InsertNodesInBSTRecursive {
	
	private TreeNode root;
	
	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode (int data) {
			this.data = data;
		}
	}
	
	// Inserting nodes in tree
	public void insert(int value) {
		root = insert(root, value);
	}
	
	public TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (root.data > value) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;	
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		 
		InsertNodesInBSTRecursive ob = new InsertNodesInBSTRecursive();
		ob.insert(5);
		ob.insert(3);
		ob.insert(7);
		ob.insert(1);
		
		ob.inOrder();

	}

}
