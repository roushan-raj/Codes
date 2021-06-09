
import java.util.*;

public class Q6_Method1_MostOptimal_Day17 {
	
	class Node {
		int data;
		Node left;
		Node right;
		int height;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public void bottomView(Node root) {
		if(root == null) {
			return;
		}
		
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.remove();
			int hd = temp.height;
			
			if(map.get(hd) == null) {
				map.put(hd, temp.data);
			}
			
			if(temp.left != null) {
				temp.left.height = hd - 1;
				q.add(temp.left);
			}
			
			if(temp.right != null) {
				temp.right.height = hd + 1;
				q.add(temp.right);
			}
		}
		System.out.print(map.values() + " ");
	}

	public static void main(String[] args) {
		Q6_Method1_MostOptimal_Day17 ob = new Q6_Method1_MostOptimal_Day17();
		
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
		
		ob.bottomView(root);
	}
}
