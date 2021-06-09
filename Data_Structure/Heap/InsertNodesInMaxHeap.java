
public class InsertNodesInMaxHeap {
	
	private Integer[] heap;
	private int n;
	
	public InsertNodesInMaxHeap (int capacity) {
		heap = new Integer [capacity + 1];
		n=0;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size () {
		return n;
	}
	
	public void insert (int x) {
		if (n == heap.length - 1) {
			resize (2*heap.length);
		}
		n++;
		heap[n] = x;
		heapify(n);
	}
	
	private void heapify (int k) {
		while (k > 1 && heap[k/2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2;
		} 
	}
	
	private void resize (int capacity) {
		Integer [] temp = new Integer [capacity];
		for (int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}
	
	public void printMaxheap() {
		for (int i=1; i<=n; i++) {
			System.out.print(heap[i] + " ");
		}
	}

	public static void main(String[] args) {
		 
		InsertNodesInMaxHeap ob = new InsertNodesInMaxHeap(3);
		ob.insert(4);
		ob.insert(5);
		ob.insert(2);
		ob.insert(6);
		ob.insert(1);
		ob.insert(3);
		System.out.println("Size of Max heap is : " + ob.size());
		ob.printMaxheap();

	}

}
