
public class SearchANodeInBSTRecursive {
	
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
	
	// searching key in tree
	public TreeNode search(int key) {
		return search(root, key);
	}
	
	public TreeNode search(TreeNode root, int key) {
		if (root == null || root.data == key) {
			return root;
		}
		if (key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
		
	}
	
	// printing tree elements in INORDER fashion
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
		 
		SearchANodeInBSTRecursive ob = new SearchANodeInBSTRecursive();
		ob.insert(5);
		ob.insert(3);
		ob.insert(7);
		ob.insert(1);
		
		ob.inOrder();
		
		System.out.println();
		
		if (null != ob.search(7)) {
			System.out.println("Key found");
		} else {
			System.out.println("Key not found");
		}

	}

}
