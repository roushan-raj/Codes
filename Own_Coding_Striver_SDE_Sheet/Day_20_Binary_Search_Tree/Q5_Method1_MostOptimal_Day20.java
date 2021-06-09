
public class Q5_Method1_MostOptimal_Day20 {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		int height;
		
		public TreeNode(int data) {
			this.val = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        
        if(p.val > root.val && q.val > root.val) 
            return lowestCommonAncestor(root.right, p, q);
        
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
