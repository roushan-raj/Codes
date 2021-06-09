import java.util.*;
public class Q4_Method1_MostOptimal_Day21 {
	
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
	
	Stack<TreeNode> st = new Stack<>();
	TreeNode curr;
	public void leftSubtree(TreeNode root) {
		if(root == null)
			return;
		
		curr = root;
		while(curr != null) {
			st.push(curr);
			curr = curr.left;
		}
	}
	
	public int next() {
		curr = st.pop();
		if(curr.right != null) {
			st.push(curr.right);
		}
		return curr.data;
	}
	
	public boolean hasNext() {
		return st.size() > 0;
	}

	public static void main(String[] args) {
		Q4_Method1_MostOptimal_Day21 ob = new Q4_Method1_MostOptimal_Day21();
		
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
		
		ob.leftSubtree(root);
		System.out.println(ob.hasNext());
		System.out.println(ob.next());
		
		System.out.println(ob.hasNext());
		System.out.println(ob.next());
		
		System.out.println(ob.hasNext());
		System.out.println(ob.next());
		
		System.out.println(ob.hasNext());
		System.out.println(ob.next());
		
		System.out.println(ob.hasNext());
		System.out.println(ob.next());
		
		System.out.println(ob.hasNext());
		System.out.println(ob.next());
		
		System.out.println(ob.hasNext());
		System.out.println(ob.next());
		
		System.out.println(ob.hasNext());
		//System.out.println(ob.next());
	}
}
