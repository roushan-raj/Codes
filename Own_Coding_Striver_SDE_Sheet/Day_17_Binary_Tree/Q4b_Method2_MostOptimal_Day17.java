import java.util.*;
public class Q4b_Method2_MostOptimal_Day17 {
	
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
	
	public void leftView(Node root) {
		Queue<Node> q = new LinkedList<>();
		Node temp = root;
		q.offer(temp);
		
		while(!q.isEmpty()) {
			int len = q.size();
			
			for(int i=0; i<len; i++) {
				Node node = q.poll();
				
				if(i == 0) {    // if(i == len-1) --> it will give Right view
					System.out.print(node.data + " ");
				}
				if(node.left != null) {
					q.offer(node.left);
				}
				if(node.right != null) {
					q.offer(node.right);
				}
			}
		}
	}

	public static void main(String[] args) {
		Q4b_Method2_MostOptimal_Day17 ob = new Q4b_Method2_MostOptimal_Day17();
		
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
		
		ob.leftView(root);
	}
}
