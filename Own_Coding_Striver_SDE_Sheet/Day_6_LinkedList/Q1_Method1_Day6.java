
public class Q1_Method1_Day6 {
	
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
	
	public void intersectionPoint(list head1, list head2) {
		
		list current1 = head1;
		list current2 = head2;
		
		 // If one of the head is null 
	    if (current1 == null || current2 == null ) 
	        return ; 
	  
		while(current1 != null || current2 != null || current1 != current2) {
		    current1 = current1.next; 
	        current2 = current2.next; 
	  
	        // If we get intersection node 
	        if (current1 == current2) 
	           System.out.println(current1.data); 
	  
	        // If one of them reaches end 
	        if (current1 == null ) 
	            current1 = head2; 
	        if (current2 == null ) 
	            current2 = head1; 
		}
		System.out.println(current1.data); 
	}

	public static void main(String[] args) {
		 
		Q1_Method1_Day6 ob = new Q1_Method1_Day6();
		//ob.insert1(1);
		ob.insert1(2);
		ob.insert1(3);
		ob.insert1(4);
		ob.insert1(16);
		ob.insert1(17);
		ob.insert1(18);
		
		//ob.insert2(11);
		ob.insert2(25);
		ob.insert2(30);
		ob.insert2(35);
		ob.insert2(40);
		ob.insert2(16);
		ob.insert2(17);
		ob.insert2(18);
		
		ob.display1();
		ob.display2();
		
		ob.intersectionPoint(head1, head2);
	}
}
