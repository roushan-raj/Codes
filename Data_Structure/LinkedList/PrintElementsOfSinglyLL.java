import java.util.*;
import java.io.*;
public class PrintElementsOfSinglyLL {
	
	//private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
	public ListNode (int data) {
		this.data = data;
		this.next = null;		
	  }	
	}
	
	public void display (ListNode head) {
		if (head == null) {       // if 1st node is null, no element exist
			return;
		}
		
		// make a variable 'current' which points to 1st element at start
		ListNode current = head;  
		
		// this loop will run until last element i.e null 
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;   // points to next element in LL 
		}
		System.out.println(current);  // here current will be null
	}

	public static void main(String[] args) {
		
		// 10 --> 20 --> 30 --> 40 --> null
		// 10 as head node of Linked list
		ListNode head = new ListNode (10);
		ListNode second = new ListNode (20);
		ListNode third = new ListNode (30);
		ListNode fourth = new ListNode (40);
		
		// Attach them together to form a list
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		PrintElementsOfSinglyLL LL = new PrintElementsOfSinglyLL();
		LL.display(head);
	
	}

}
