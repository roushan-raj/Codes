
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q3b_Method2_MostOptimal_Day17 {
	
	//////////////// Post-Order Non-recursive Approach ///////////////
	
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
	
	public List<Integer> postOrder (Node root) {
		
		Stack<Node> st1 = new Stack<>();
		Stack<Node> st2 = new Stack<>();
		List<Integer> res = new ArrayList<>();
		
		if(root == null) {
			return res;
		}
		
		Node temp = root;
		st1.push(temp);
		
		while(!st1.isEmpty()) {
			Node top = st1.pop();
			st2.push(top);
			
			if(top.left != null) {
				st1.push(top.left);
			}
			if(top.right != null) {
				st1.push(top.right);
			}
		}
		
		while(!st2.isEmpty()) {
			Node ans = st2.pop();
			res.add(ans.data);
		}
		return res;
	}

	public static void main(String[] args) {
		Q3b_Method2_MostOptimal_Day17 ob = new Q3b_Method2_MostOptimal_Day17();
		
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
		
		System.out.println(ob.postOrder(root));
	}
}
