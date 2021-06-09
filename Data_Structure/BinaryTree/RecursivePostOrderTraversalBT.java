
public class RecursivePostOrderTraversalBT {
	
   private TreeNode root;
	
		private class TreeNode {                             // Post-order means
			private TreeNode left;                                    // left
			private TreeNode right;                                  // right
			private int data;                                               // root
			
			public TreeNode(int data) {
				this.data = data;
			}
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
		
		third.left = sixth;
		third.right = seventh;
	}
	
	public void postOrder (TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		 
		RecursivePostOrderTraversalBT ob = new RecursivePostOrderTraversalBT();
		ob.createBinaryTree();
		ob.postOrder(ob.root);

	}

}
