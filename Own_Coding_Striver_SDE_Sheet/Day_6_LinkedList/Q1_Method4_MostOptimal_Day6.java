
public class Q1_Method4_MostOptimal_Day6 {
	
	private static list head1 ;
	private static list head2 ;
	
	private class list{
		private int data;
		private list next;
		
		public list(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insert1(int data) {
		list node1 = new list(data);
		list list_head1 = head1;
		if(head1 == null) {
			head1 = node1;
		} else {
			while(list_head1.next != null) {
				list_head1 = list_head1.next;
			}
			list_head1.next = node1;
		}
	}
	
	public void insert2(int data) {
		list node2 = new list(data);
		list list_head2 = head2;
		if(head2 == null) {
			head2 = node2;
		} else {
			while(list_head2.next != null) {
				list_head2 = list_head2.next;
			}
			list_head2.next = node2;
		}
	}
	
	public void display1() {
		list current = head1;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void display2() {
		list current = head2;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public list intersectionPoint(list head1, list head2) {
		if(head1 == null || head2 == null) 
			return null;
		
		list l1 = head1;
		list l2 = head2;
		
		while(l1 != l2) {
			l1 = l1 == null ? head2 : l1.next;
			l2 = l2 == null ? head1 : l2.next;
		}
		return l1;
	}

	public static void main(String[] args) {
		Q1_Method4_MostOptimal_Day6 ob = new Q1_Method4_MostOptimal_Day6();
		
		ob.insert1(3);
		ob.insert1(4);
		ob.insert1(16);
		ob.insert1(17);
		ob.insert1(18);
		
		ob.insert2(25);
		ob.insert2(30);
		ob.insert2(35);
		ob.insert2(40);
		ob.insert2(16);
		ob.insert2(17);
		ob.insert2(18);
		
		ob.display1();
		ob.display2();
		
		System.out.println(ob.intersectionPoint(head1, head2));
		
	}
}
