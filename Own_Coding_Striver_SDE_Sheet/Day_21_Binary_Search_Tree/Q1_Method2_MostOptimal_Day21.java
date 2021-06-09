import java.util.*;

public class Q1_Method2_MostOptimal_Day21 {
	
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
	
	public void getFloorAndCeil (TreeNode node, int val) {
		if(node == null)
			System.out.println("Tree does not exist");
		
		TreeNode floor = null;
		TreeNode ceil = null;
		
		while(node != null) {
			if(val < node.data) {
				ceil = node;
				node = node.left;
			}
			else if(val > node.data) {
				floor = node;
				node = node.right;
			}
			else {
				ceil = floor = node;
				break;
			}
		}
		
		List<TreeNode> res = new ArrayList<>();
		res.add(floor);
		res.add(ceil);
		
		if(res.get(0) != null)
			System.out.println(res.get(0).data);
		else
			System.out.println("Floor does not exist for given value");
		
		if(res.get(1) != null)
			System.out.println(res.get(1).data);
		else
			System.out.println("Ceil does not exist for given value");
	}

	public static void main(String[] args) {
		
		Q1_Method2_MostOptimal_Day21 ob = new Q1_Method2_MostOptimal_Day21();
		
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
		
		ob.getFloorAndCeil(root, 15);
	}
}
