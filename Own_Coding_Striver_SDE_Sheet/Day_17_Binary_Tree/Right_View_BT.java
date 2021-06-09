
import java.util.LinkedList;
import java.util.Queue;

public class Right_View_BT {
	
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
				
				if(i == len-1) {   
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
		Right_View_BT ob = new Right_View_BT();
		
		Node root = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(7);
		Node g = ob.new Node(8);
		
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		d.right = g;
		
		ob.leftView(root);
	}
}
