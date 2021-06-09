import java.util.LinkedList;
import java.util.Queue;

public class LinearOrderTraversalBinaryTree {
	
	private TreeNode root;
		
		private class TreeNode {                             // Linear-order traversal means
			private TreeNode left;                                    // level wise traversal
			private TreeNode right;                                
			private int data;                                               
			
			public TreeNode(int data) {
				this.data = data;
			}
		}
		
		public void createBinaryTree() {
			TreeNode first = new TreeNode(1);
			TreeNode second = new TreeNode(2);
			TreeNode third = new TreeNode(3);
			TreeNode fourth = new TreeNode(4);
			TreeNode fifth = new TreeNode(5);
			TreeNode sixth = new TreeNode(6);
			TreeNode seventh = new TreeNode(7);
			
			root = first;
			first.left = second;
			first.right = third;
			
			second.left = fourth;
			second.right = fifth;
			
			third.left = sixth;
			third.right = seventh;
		}
		
		public void linearOrder(TreeNode root) {
			if (root == null) {
				return;
			}
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(root);
			while (!queue.isEmpty()) {
				TreeNode temp = queue.poll();
				System.out.print(temp.data + " ");
				if(temp.left != null) {
					queue.offer(temp.left);
				}
				if(temp.left != null) {
					queue.offer(temp.right);
				}
			}
			
		}

	public static void main(String[] args) {
		 
		LinearOrderTraversalBinaryTree ob = new LinearOrderTraversalBinaryTree();
		ob.createBinaryTree();
		ob.linearOrder(ob.root);

	}

}
