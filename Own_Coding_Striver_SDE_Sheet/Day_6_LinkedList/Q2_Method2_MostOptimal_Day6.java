
public class Q2_Method2_MostOptimal_Day6 {
	
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
		
		ListNode first = new ListNode(11);
		ListNode second = new ListNode(22);
		ListNode third = new ListNode(33);
		ListNode fourth = new ListNode(44);
		ListNode fifth = new ListNode(55);
		ListNode sixth = new ListNode(66);
		ListNode seventh = new ListNode(77);
		ListNode eighth = new ListNode(88);
		ListNode ninth = new ListNode(99);
		ListNode tenth = new ListNode(111);
		
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
		tenth.next = fifth;
		
	}
    
    public boolean detectingCycle() {
    	ListNode slow = head;
    	ListNode fast = head;
    	if(head == null || head.next == null)
    		return false;
    	while(fast.next != null && fast.next.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		
    		if(slow == fast) {
    			return true;
    		}
    	}
    	return false;
    }

	public static void main(String[] args) {
		
		Q2_Method2_MostOptimal_Day6 ob = new Q2_Method2_MostOptimal_Day6();
		ob.createLinkedListWithLoop();
		System.out.println(ob.detectingCycle());
	}
}
