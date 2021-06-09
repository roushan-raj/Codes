import java.util.*;
public class Q1a_Method_MostOptimal_Day18 {
	
	/////////////// Level Order Traversal /////////////
	
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
	
	public List<Integer> leverOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		List<Integer> res = new ArrayList<>();
		
		if(root == null) {
			return res;
		}
		
		Node temp = root;
		q.offer(temp);
		
		while(!q.isEmpty()) {
			Node node = q.remove();
			res.add(node.data);
			
			if(node.left != null) {
				q.offer(node.left);
			}
			
			if(node.right != null) {
				q.offer(node.right);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Q1a_Method_MostOptimal_Day18 ob = new Q1a_Method_MostOptimal_Day18();
		
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
		
		System.out.print(ob.leverOrderTraversal(root) + " ");
	}
}
