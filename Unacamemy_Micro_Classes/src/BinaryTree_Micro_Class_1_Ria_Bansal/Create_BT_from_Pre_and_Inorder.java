
package BinaryTree_Micro_Class_1_Ria_Bansal;
public class Create_BT_from_Pre_and_Inorder {
	
	private class Node {
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	@SuppressWarnings("unused")
	private int size;   // it will represent total no.of nodes in the tree.
	
	public Create_BT_from_Pre_and_Inorder(int [] pre, int [] in) {
		this.root = constructBT(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}
	
	private Node constructBT(int [] pre, int [] in, int plo, int phi, int ilo, int ihi) {
		
		if(plo > phi || ilo > ihi) {
			return null;
		}
		
		Node nn = new Node();
		nn.data = pre[plo];
		
		int si = -1;
		for(int i = ilo; i<= ihi; i++) {
			if(pre[plo] == in[i]) {
				si = i;
				break;
			}
		}
		
		int nel = si - ilo;
		
		nn.left = constructBT(pre, in, plo + 1, plo + nel, ilo, si - 1);
		nn.right = constructBT(pre, in, plo + nel + 1 ,phi ,si + 1, ihi);
		
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
	
	

	public static void main(String[] args) {
		
		int [] pre = {10,20,40,50,60,70,30,80};
		int [] in = {40,20,60,50,70,10,80,30};
		Create_BT_from_Pre_and_Inorder ob = new Create_BT_from_Pre_and_Inorder(pre, in);
		ob.display();
	}
}
