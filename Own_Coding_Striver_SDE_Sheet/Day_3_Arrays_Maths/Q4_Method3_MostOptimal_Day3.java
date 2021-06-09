
import java.util.ArrayList;
import java.util.List;

public class Q4_Method3_MostOptimal_Day3 {
	
	public List<Integer> majorityElement(int[]arr) {
		int num1 = -1; int num2 = -1;
		int c1 = 0; int c2 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num1)
				c1++;
			else if(arr[i] == num2)
				c2++;
			else if(c1 == 0) {
				num1 = arr[i];
				c1=1;
			}
			else if(c2 == 0) {
				num2 = arr[i];
				c2=1;
			}
			else {
				c1--;
				c2--;
			}		
		}
		
		List<Integer> ans = new ArrayList<Integer>();
		c1 = 0; 
		c2 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num1)
				c1++;
			else if(arr[i] == num2)
				c2++;
		}
		if(c1 > arr.length/3)
			ans.add(num1);
		if(c2 > arr.length/3)
			ans.add(num2);
		
		return ans;	
	}

	public static void main(String[] args) {
		 
		Q4_Method3_MostOptimal_Day3 ob = new Q4_Method3_MostOptimal_Day3();
		int [] arr = new int [] {1,1,1,3,3,2,2,2};
		System.out.print("Majority Element is: "+ob.majorityElement(arr));
	}
}
