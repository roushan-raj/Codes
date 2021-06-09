
public class Q2a_Method1_MostOptimal_Day20 {
	
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
	
	//////////////////// Recursive Method /////////////////////
	
	 public Node searchBST(Node root, int val) {
	        if(root == null) return null;
	        if(root.data == val) return root;
	        
	        if(val < root.data) {
	            return searchBST(root.left, val);
	        }
	        else {
	            return searchBST(root.right, val);
	        }
	    }

	public static void main(String[] args) {
		
	}
}
