import java.util.*;
public class Q4_Straight_line_or_0 {
	
	static class pair{
		
	    int first, second;
	    
	    pair(int first, int second){
	        this.first = first;
	        this.second = second;
	    }
	}
	 
	static void isStraightLinePossible(ArrayList<pair> arr, int n){
	    
	    int x0 = arr.get(0).first;
	    int y0 = arr.get(0).second;
	 
	    int x1 = arr.get(1).first;
	    int y1 = arr.get(1).second;
	 
	    int dx = x1 - x0, dy = y1 - y0;
	    
	    boolean flag = false;
	 
	    for(int i = 0; i < n; i++) {
	    	
	        int x = arr.get(i).first;
	        int y = arr.get(i).second;
	        if (dx * (y - y1) != dy * (x - x1)){
	            flag = true;
	        }
	    }
	    if(flag) {
	    	System.out.println("0");
	    }
	    else {
	    	System.out.println("1x-1y=0");	
	    }
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<pair> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			
			arr.add(new pair(p, q));
		}
		
//	    arr.add(new pair(1, 1));
//	    arr.add(new pair(2, 2));
//	    arr.add(new pair(3, 3));
//	 
//	    int n = arr.size();
	 
	    isStraightLinePossible(arr, n);
	}
}
