import java.util.*;
public class Q1b_Method2_MostOptimal_Day17 {
	
	//////////////// In-Order Non-recursive Approach ///////////////
	
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
	
	public List<Integer> inOrder (Node root) {
		Stack<Node> st = new Stack<>();
		List<Integer> ans = new ArrayList<>();
		
		if(root == null) {
			return ans;
		}
		
		Node curr = root;
		
		while(curr != null || !st.isEmpty()) {
			while(curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			ans.add(curr.data);
			curr = curr.right;
		}
		return ans;
	}

	public static void main(String[] args) {
		Q1b_Method2_MostOptimal_Day17 ob = new Q1b_Method2_MostOptimal_Day17();
		
		Node root = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		Node g = ob.new Node(7);
		
		root.left = b;
		root.right = g;
		b.left = c;
		b.right = d;
		c.left = e;
		e.right = f;
		
		System.out.println(ob.inOrder(root));
	}
}
