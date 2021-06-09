import java.util.*;
public class Path_Between_Root_To_AnyLeafNodes_In_BT {
	
	static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static boolean path(Node root, List<Integer> res, int p) {
		
		if(root == null) {
			return false;
		}
		
		Node temp = root;
		res.add(root.data);
		
		if(root.data == p) {
			return true;
		}
		
		if(path(temp.left, res, p) || path(temp.right, res, p)) {
			return true;
		}
		res.remove(res.size()-1);
		
		return false;
	}
	
	public static void printPath(Node root, int p) {
		List<Integer> res = new ArrayList<>();
		if(path(root, res, p)) {
			for(int i=0; i<res.size(); i++) {
				System.out.print(res.get(i) + " ");
			}
		}
		else {
			System.out.println("No path");
		}
	}

	public static void main(String[] args) {
		
		Node root = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		Node f = new Node(6);
		//Node g = ob.new Node(7);
		
		root.left = b;
		root.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		//f.left = g;
		
		printPath(root, 6);
	}
}
