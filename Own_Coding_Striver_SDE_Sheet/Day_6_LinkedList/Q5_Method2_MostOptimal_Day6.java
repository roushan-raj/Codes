
public class Q5_Method2_MostOptimal_Day6 {
	
	private static ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode (int data) {
			this.data = data;
			this.next = null;
		}
	}
	
    public void createLinkedListWithLoop () {
		
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(3);
		ListNode sixth = new ListNode(6);
		ListNode seventh = new ListNode(7);
		ListNode eighth = new ListNode(8);
		ListNode ninth = new ListNode(9);
		ListNode tenth = new ListNode(10);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eighth;
		eighth.next = ninth;
		ninth.next = tenth;
		tenth.next = third;
	}
    
    public int detectCycle(ListNode head) {
    	if(head == null || head.next == null) {
    		return -1;
    	}
    	ListNode slow = head;
    	ListNode fast = head;
    	ListNode entry = head;
    	
    	while(fast.next != null && fast.next.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if(fast == slow) {
    			while(entry != slow) {
    				entry = entry.next;
    				slow = slow.next;
    			}
    			return entry.data;
    		}
    	}
    	return -1;
    }

	public static void main(String[] args) {
		
		Q5_Method2_MostOptimal_Day6 ob = new Q5_Method2_MostOptimal_Day6();
		ob.createLinkedListWithLoop();
		System.out.println("Starting point of cycle is : "+ob.detectCycle(head));
	}
}
