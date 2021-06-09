import java.util.*;
public class Q4_Method1_MostOptimal_Day20 {
	
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
	
	////////// Function code ////////////
	
	public boolean isValidBST(Node root) {
        if(root == null) return false;
        
        Stack<Node> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        st.add(root);
        root = root.left;
        
        while(!st.isEmpty() || root != null) {
            while(root != null) {
                st.add(root);
                root = root.left;
            }
            root = st.pop();
            list.add(root.data);
            root = root.right;
        }
        
        for(int i=1; i<list.size(); i++) {
            if(list.get(i) <= list.get(i-1)) {
                return false;
            }
        }
         return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
