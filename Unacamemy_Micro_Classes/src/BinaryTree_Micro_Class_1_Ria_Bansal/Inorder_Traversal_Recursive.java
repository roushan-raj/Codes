
package BinaryTree_Micro_Class_1_Ria_Bansal;
import java.util.*;
public class Inorder_Traversal_Recursive {
	
	private class Node {
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	@SuppressWarnings("unused")
	private int size;   // it will represent total no.of nodes in the tree.
	
	public Inorder_Traversal_Recursive() {
		this.root = takeInput(new Scanner(System.in), null, true);
	}
	
	public Node takeInput(Scanner sc, Node parent, boolean ilc) {
		if(parent == null) {
			System.out.println("Root node data ?");
		} else {
			if(ilc) {
				System.out.println("Enter the value of left child of " + parent.data);
			} else {
				System.out.println("Enter the value of right child of " + parent.data);
			}
		}
		
		int val = sc.nextInt();
		Node nn = new Node();
		nn.data = val;
		this.size++;
		
		System.out.println(nn.data + " has left child ?");
		boolean hlc = sc.nextBoolean();
		
		if(hlc) {
			nn.left = takeInput(sc, nn, true);
		}
		
		System.out.println(nn.data + " has right child ?");
		boolean hrc = sc.nextBoolean();
		
		if(hrc) {
			nn.right = takeInput(sc, nn, false);
		}
		
		return nn;
	}
	
	public void display() {
		System.out.println("----------------");
		display(this.root);
		System.out.println("----------------");
	}
	
	private void display(Node node) {
		if(node == null) {
			return;
		}
		
		String str = "";
		if(node.left == null) {
			str += ".";
			
		} else {
			str += node.left.data;
		}
		
		str += " <-- " + node.data + " --> ";
		
		if(node.right == null) {
			str += ".";
			
		} else {
			str += node.right.data;
		}
		
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	
	public void inorder(Node node) {
		if(node == null)
			return;
		
		inorder (node.left);
		System.out.print(node.data + " ");
		inorder (node.right);
	}

	public static void main(String[] args) {
		Inorder_Traversal_Recursive ob = new Inorder_Traversal_Recursive();
		ob.display();
		System.out.println("In-order traversal is: ");
		ob.inorder(ob.root);
	}
}
