import java.util.*;
public class Q5_LinkedList_Slot_2_22Dec2020 {
	
	private Node head = null;
	
	private class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertNode(int val) {
		Node temp = head;
		Node newNode = new Node(val);
		
		if(head==null) {
			head = newNode;
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public void alternateAddition(Node head) {
		Map<Node, Integer> map = new LinkedHashMap<>();
		Node curr = head;
		while(curr != null) {
			map.put(curr, curr.data);
			curr = curr.next;
		}
		
		Node first = head;
		Node update = first.next.next;
		
		while(update != null) {
			int updateVal = map.get(first) + map.get(update);
			update.data = updateVal;
			first = first.next;
			update = update.next;
		}
		
		// using for loop to print all entries of map
		for(Map.Entry<Node, Integer> set : map.entrySet()) {
			System.out.println(set.getKey() +" : "+set.getValue());
		}
		System.out.println();
		
		// using forEach loop to print all entries of map
		map.forEach((key, value) -> System.out.println(key+" : "+value));
		System.out.println();
		
		// using Iterator to print all entries of map
		Iterator<Map.Entry<Node, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Node, Integer> entry = it.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Q5_LinkedList_Slot_2_22Dec2020 ob = new Q5_LinkedList_Slot_2_22Dec2020();
		ob.insertNode(1);
		ob.insertNode(2);
		ob.insertNode(3);
		ob.insertNode(4);
		ob.insertNode(5);
		ob.insertNode(6);
		
		ob.display();
		ob.alternateAddition(ob.head);
		ob.display();
	}
}
