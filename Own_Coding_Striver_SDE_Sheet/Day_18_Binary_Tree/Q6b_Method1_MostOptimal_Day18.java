import java.util.*;
public class Q6b_Method1_MostOptimal_Day18 {
	
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
	
	public boolean checkIdential(Node root1, Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		
		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2 = new LinkedList<>();
		
		Node temp1 = root1;
		Node temp2 = root2;
		
		q1.offer(temp1);
		q2.offer(temp2);
		
		while(!q1.isEmpty() && !q2.isEmpty()) {
			temp1 = q1.poll();
			temp2 = q2.poll();
			
			if(temp1.data != temp2.data) {
				return false;
			}
			
			if(temp1.left != null && temp2.left != null) {
				q1.offer(temp1.left);
				q2.offer(temp2.left);
			}
			else if(temp1.left != null || temp2.left != null) {
				return false;
			}
			
			if(temp1.right != null && temp2.right != null) {
				q1.offer(temp1.right);
				q2.offer(temp2.right);
			}
			else if(temp1.right != null || temp2.right != null) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Q6b_Method1_MostOptimal_Day18 ob = new Q6b_Method1_MostOptimal_Day18();
		
		Node root1 = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		//Node g = ob.new Node(7);
		
		root1.left = b;
		root1.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		//f.left = g;
		
		Node root2 = ob.new Node(1);
		Node p = ob.new Node(2);
		Node q = ob.new Node(3);
		Node r = ob.new Node(4);
		Node s = ob.new Node(5);
		Node t = ob.new Node(6);
		//Node u = ob.new Node(7);
		
		root2.left = p;
		root2.right = q;
		p.left = r;
		p.right = s;
		q.right = t;
		//t.left = u;
		
		System.out.println(ob.checkIdential(root1, root2));
	}
}
