import java.util.*;
public class Q2b_Method1_MostOptimal_Day21 {
	
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
	
	public void getKthLargestElement(TreeNode root, int pos) {
		if(root == null)
			return;
		
		int count = 0;
		Stack<TreeNode> st = new Stack<>();
		TreeNode curr = root;
		
		while(curr != null || !st.isEmpty()) {
			while(curr != null) {
				st.push(curr);
				curr = curr.right;
			}
			curr = st.pop();
			count++;
			if(count == pos) {
				System.out.println(curr.data);
			}
			curr = curr.left;
		}
	}

	public static void main(String[] args) {
		
		Q2b_Method1_MostOptimal_Day21 ob = new Q2b_Method1_MostOptimal_Day21();
		
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
		
		ob.getKthLargestElement(root, 1);
	}

}
