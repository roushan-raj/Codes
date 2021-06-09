import java.util.*;
public class Q1b_Method_MostOptimal_Day18 {
	
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
	
	public List<Integer> levelOrderSpiralTraversal(Node root) {
		Stack<Node> st1 = new Stack<>();
		Stack<Node> st2 = new Stack<>();
		List<Integer> res = new ArrayList<>();
		
		if(root == null) {
			return res;
		}
		
		Node temp = root;
		st1.add(temp);
		
		while(!st1.isEmpty() || !st2.isEmpty()) {
			while(!st1.isEmpty()) {
				Node top1 = st1.pop();
				res.add(top1.data);
				
				if(top1.left != null) {
					st2.add(top1.left);
				}
				
				if(top1.right != null) {
					st2.add(top1.right);
				}
			}
			
			while(!st2.isEmpty()) {
				Node top2 = st2.pop();
				res.add(top2.data);
				
				if(top2.right != null) {
					st1.add(top2.right);
				}
				
				if(top2.left != null) {
					st1.add(top2.left);
				}
			}
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		Q1b_Method_MostOptimal_Day18 ob = new Q1b_Method_MostOptimal_Day18();
		
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
		
		System.out.print(ob.levelOrderSpiralTraversal(root) + " ");
	}

}
