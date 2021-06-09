import java.util.*;

public class Q2_Method1_MostOptimal_Day19 {
	
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
	
	////////////////// Function Code ///////////////////
	
	    Map<Integer, Integer> map = new HashMap<>();
	    int preIndex = 0;
	    
	    public Node buildTree(int[] preorder, int[] inorder) {
	        for(int i=0; i<inorder.length; i++) {
	            map.put(inorder[i], i);
	        }
	        Node root = build(preorder, inorder, 0, inorder.length - 1);
	        return root;
	    }
	    
	    @SuppressWarnings("unused")
		public Node build(int[] preorder, int[] inorder, int inStart, int inEnd) {
	        if(inStart > inEnd) {
	            return null;
	        }
	        
	        Node root = new Node(preorder[preIndex++]);
	        
	        if(root == null) {
	            return null;
	        }
	        
	        if(inStart == inEnd) {
	            return root;
	        }
	        
	        int index = map.get(root.data);
	        
	        root.left = build(preorder, inorder, inStart, index - 1);
	        root.right = build(preorder, inorder, index+1, inEnd);
	        
	        return root;
	    }
	

	public static void main(String[] args) {
		//Q2_Method1_MostOptimal_Day19 ob = new Q2_Method1_MostOptimal_Day19();
		
	}
}
