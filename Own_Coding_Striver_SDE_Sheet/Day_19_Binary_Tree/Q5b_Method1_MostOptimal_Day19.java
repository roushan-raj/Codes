
public class Q5b_Method1_MostOptimal_Day19 {
	
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
	
	////////////////// Function Code with SC - O(1) ///////////////////
	
	public void flatten(TreeNode node) {
		
		if(node == null || (node.left == null && node.right == null))
			return;
		
		if(node.left != null) {
			flatten(node.left);
			TreeNode rightnode = node.right;
			node.right = node.left;
			node.left = null;
			
			TreeNode curr = node.right;
			while(curr.right != null) {
				curr = curr.right;
			}
			curr.right = rightnode;
		}
		
		if(node.right != null) {
			flatten(node.right);
		}
	}

	public static void main(String[] args) {
		
	}
}
