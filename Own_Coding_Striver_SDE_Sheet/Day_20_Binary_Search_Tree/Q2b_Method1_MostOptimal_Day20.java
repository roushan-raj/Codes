
public class Q2b_Method1_MostOptimal_Day20 {
	
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
	
	public Node search(Node root, int val) {
		if(root == null)
			return null;
		
		Node curr = root;
		if(curr.data == val)
			return curr;
		
		else if(curr.data > val)
			curr = curr.left;
		
		else {
			curr = curr.right;
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
