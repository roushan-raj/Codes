
public class Q3_Method2 {
	
	public void repeatingMissing(int [] arr) {
		
		int [] frqArray = new int [arr.length+1];
		for(int i=0; i<arr.length+1; i++) {
			frqArray[i] = 0;
		}
		for (int i=0; i<arr.length; i++) {
			frqArray[arr[i]] = frqArray[arr[i]] + 1;
		}
		
		for (int i=1; i<frqArray.length; i++) {
			if (frqArray[i] == 2) {
				System.out.println("Repeating number is " + i);
			}
			if (frqArray[i] == 0) {
				System.out.println("Missing number is " + i);
			}
		
		}
	}
	public static void main(String[] args) {
		 
		Q3_Method2 ob = new Q3_Method2();
		int [] arr = new int [] {4,5,6,3,5,1};
		
		ob.repeatingMissing(arr);

	}

}
