import java.util.*;
public class Q3_Method1_MostOptimal_Day21 {

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
	
	public boolean checkSum(TreeNode root, int sum) {
		if(root == null)
			return false;
		
		int rem_sum = 0;
		Stack<TreeNode> st = new Stack<>();
		Set<Integer> set = new HashSet<>();
		
		TreeNode temp = root;
		st.push(temp);
		
		while(!st.isEmpty()) {
			temp = st.pop();
			rem_sum = sum - temp.data;
			
			if(set.contains(rem_sum)) {
				return true;
			}
			else {
			    set.add(temp.data);
			}
			
			if(temp.right != null)
				st.add(temp.right);
			
			if(temp.left != null)
				st.add(temp.left);
		}
		return false;
	}

	public static void main(String[] args) {

        Q3_Method1_MostOptimal_Day21 ob = new Q3_Method1_MostOptimal_Day21();
		
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
		
		System.out.println(ob.checkSum(root, 20));
	}
}
