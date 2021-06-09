
public class Q3_Method1_MostOptimal_Day18 {
	
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
	
	int res = 0;
	public int diameterOfBinaryTree(Node root) {
	        getDiameter(root);
	        return res == 0?0:res-1;
	}	
	     
    public int getDiameter(Node root) {
        if(root == null) {
            return 0;
        }
        
        int ld = getDiameter(root.left);
		int rd = getDiameter(root.right);
		res = Math.max(res, ld+rd+1);
		
		return Math.max(ld, rd) + 1;
   
	}

	public static void main(String[] args) {
		Q3_Method1_MostOptimal_Day18 ob = new Q3_Method1_MostOptimal_Day18();
		
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
		
		System.out.println(ob.diameterOfBinaryTree(root));
	}
}
