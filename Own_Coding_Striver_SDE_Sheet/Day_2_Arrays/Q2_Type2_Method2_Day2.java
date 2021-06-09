import java.util.ArrayList;
import java.util.List;

public class Q2_Type2_Method2_Day2 {
	
	public List<Integer> pascalTriangle(int row){
		List<Integer> arr = new ArrayList<>(row);
		int res = 1;
		
		for(int i=0; i<row; i++) {
			if(i == 0 || i == row-1) {
				arr.add(1);
			} 
			else {
				res *= row-i;
				arr.add(res / i);
				res = arr.get(i);
			}
		}
		return arr;	
	}

	public static void main(String[] args) {
		 
		Q2_Type2_Method2_Day2 ob = new Q2_Type2_Method2_Day2();
		System.out.println(ob.pascalTriangle(5));
	}
}
