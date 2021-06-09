
public class Q4_Method1_MostOptimal_Day19 {
	
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
	
	/////////////// Function Code //////////////////
	
	public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode leftTree, TreeNode rightTree) {
        if(leftTree == null && rightTree == null)
            return true;
        if(leftTree == null || rightTree == null)
            return false;
        
        return leftTree.data == rightTree.data &&
               isMirror(leftTree.left, rightTree.right) &&
               isMirror(leftTree.right, rightTree.left);
    }

	public static void main(String[] args) {
		
	}

}
