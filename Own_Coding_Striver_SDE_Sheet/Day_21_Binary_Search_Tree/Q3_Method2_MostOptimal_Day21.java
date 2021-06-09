import java.util.*;

public class Q3_Method2_MostOptimal_Day21 {
	
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
		
		int pointers_sum = 0;
		Stack<TreeNode> st = new Stack<>();
		List<Integer> list = new ArrayList<>();
		
		TreeNode curr = root;
		
		while(curr != null || !st.isEmpty()) {
			while(curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			list.add(curr.data);
			curr = curr.right;
		}
		
		System.out.println(list);
		
		int start = 0;
		int end = list.size() - 1;
		
		while(start < end) {
			pointers_sum = list.get(start) + list.get(end);
			
			if(pointers_sum == sum)
				return true;
			
			if(pointers_sum > sum)
				end--;
			else
				start++;
		}
		return false;
	}

	public static void main(String[] args) {
		Q3_Method2_MostOptimal_Day21 ob = new Q3_Method2_MostOptimal_Day21();
		
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
		
		System.out.println(ob.checkSum(root, 15));
	}
}
