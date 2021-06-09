import java.util.*;
public class Q5_Method1_MostOptimal_Day19 {
	
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
	
	public void flatten(TreeNode root) {
        if(root == null) return;
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()) {
            TreeNode curr = st.pop();
            
            if(curr.right != null)
                st.push(curr.right);
            
            if(curr.left != null)
                st.push(curr.left);
            
            if(!st.isEmpty()) {
                curr.right = st.peek();
            }
            curr.left = null;     
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
