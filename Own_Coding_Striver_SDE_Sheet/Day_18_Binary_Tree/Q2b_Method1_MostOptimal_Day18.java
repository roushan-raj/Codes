import java.util.*;
public class Q2b_Method1_MostOptimal_Day18 {
	
	/////////////// Height of Tree Non Recursive solution ////////////
	
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
	
	public int heightOfBinaryTree(Node root) {
	    if(root == null) {
	    	return -1;
	    }
	    
	    Queue<Node> q = new LinkedList<>();
	    Node temp = root;
	    q.offer(temp);
	    
	    int height = 0;
	    while(!q.isEmpty()) {
	    	int len = q.size();
	    	
	    	for(int i=0; i<len; i++) {
	            Node node = q.poll();
	    		if(i == 0) {
	    			height++;
	    		}
	    		
	    		if(node.left != null)
		    		q.offer(node.left);
		    	
		    	if(node.right != null)
		    		q.offer(node.right);
	    	}    	
	    }
	    return height-1;
	}

	public static void main(String[] args) {
		Q2b_Method1_MostOptimal_Day18 ob = new Q2b_Method1_MostOptimal_Day18();
		
		Node root = ob.new Node(1);
		Node b = ob.new Node(2);
		Node c = ob.new Node(3);
		Node d = ob.new Node(4);
		Node e = ob.new Node(5);
		Node f = ob.new Node(6);
		Node g = ob.new Node(7);
		
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		f.left = g;
		
		System.out.println(ob.heightOfBinaryTree(root));
	}
}
