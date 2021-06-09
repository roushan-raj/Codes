
public class Q3_Method2_MostOptimal_Day6 {
	
	private static list head;
	
	private class list{
		private int data;
		private list next;
		
		public list(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insert1(int data) {
		list node = new list(data);
		list list_head = head;
		if(head == null) {
			head = node;
		} else {
			while(list_head.next != null) {
				list_head = list_head.next;
			}
			list_head.next = node;
		}
	}
	
	public void display() {
		list current = head;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public boolean palindrome(list head) {
		if (head == null || head.next == null)
			return false;
		list slow = head;
		list fast = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		slow.next = reverse(slow.next);
		
		slow = slow.next;
		
		while(slow != null) {
			if(head.data != slow.data)
				return false;
			head = head.next;
			slow = slow.next;
		}
		return true;
	}
	
	public list reverse(list head) {
		list newHead = null;
		while(head != null) {
			list next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	public static void main(String[] args) {
		Q3_Method2_MostOptimal_Day6 ob = new Q3_Method2_MostOptimal_Day6();
		
		ob.insert1(10);
		ob.insert1(11);
		ob.insert1(13);
		ob.insert1(15);
		ob.insert1(15);
		ob.insert1(13);
		ob.insert1(11);
		ob.insert1(10);
		
		ob.display();
		
		System.out.println(ob.palindrome(head));
		
		//ob.display();
	}

}
