import java.util.*;
public class Q1a_Method1_MostOptimal_Day20 {
	
	class Node {
		int data;
		Node left;
		Node right;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	/////////////////// Function Code with SC - O(n) ///////////////////
	
	 public Node connect(Node root) {
	        if(root == null)
	            return null;
	        
	        Queue<Node> q = new LinkedList<>();
	        q.add(root);
	        q.add(null);
	        
	        while(!q.isEmpty()) {
	            Node curr = q.poll();
	            if(curr == null && q.isEmpty()) {
	                return root;
	            }
	            else if(curr == null) {
	                q.add(null);
	                continue;
	            }
	            else {
	                curr.next = q.peek();
	                
	                if(curr.left != null)
	                    q.add(curr.left);
	                
	                if(curr.right != null)
	                    q.add(curr.right);
	            }
	        }   
	        return root;
	    }

	public static void main(String[] args) {
		

	}

}
