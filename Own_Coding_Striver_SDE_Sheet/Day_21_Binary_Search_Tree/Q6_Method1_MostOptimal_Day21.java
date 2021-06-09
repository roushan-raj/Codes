import java.util.*;
public class Q6_Method1_MostOptimal_Day21 {
	
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
	
	public TreeNode createNewNode(int val) {
		TreeNode newNode = new TreeNode(val);
		newNode.data = val;
		newNode.left = null;
		newNode.right = null;
		
		return newNode;
	}
	
	public void serialize(TreeNode node, List<Integer> list) {
		if(node == null) {
			list.add(-1);
			return;
		}
		list.add(node.data);
		serialize(node.left, list);
		serialize(node.right, list);
	}
	
	int index = 0;
	
	public TreeNode deSerialize(List<Integer> preOrder) {
		if(preOrder.get(index) == -1) {
			index++;
			return null;
		}
		
		TreeNode newNode = createNewNode(preOrder.get(index++));
		
		newNode.left = deSerialize(preOrder);
		newNode.right = deSerialize(preOrder);
		
		return newNode;
	}

	public static void main(String[] args) {
		Q6_Method1_MostOptimal_Day21 ob = new Q6_Method1_MostOptimal_Day21();
		
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
		
		List<Integer> list = new ArrayList<>();
		ob.serialize(root, list);
		System.out.println(ob.deSerialize(list));
	}
}
