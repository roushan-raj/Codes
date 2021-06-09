
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q2b_Method2_MostOptimal_Day17 {
	
	//////////////// Pre-Order Non-recursive Approach ///////////////
	
	class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public List<Integer> preOrder (Node root) {
		
		Stack<Node> st = new Stack<>();
		List<Integer> res = new ArrayList<>();
		
		if(root == null) {
			return res;
		}
		
		Node temp = root;
		st.push(temp);
		
		while(!st.isEmpty()) {
			Node top = st.pop();
			res.add(top.data);
			
			if(top.right != null) {
				st.push(top.right);
			}
			if(top.left != null) {
				st.push(top.left);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Q2b_Method2_MostOptimal_Day17 ob = new Q2b_Method2_MostOptimal_Day17();
		
		Node root = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		
		
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		
		System.out.println(ob.preOrder(root));
	}
}
