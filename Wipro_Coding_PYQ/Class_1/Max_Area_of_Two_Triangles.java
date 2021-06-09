
public class Max_Area_of_Two_Triangles {
	
	float area1;
	float area2;
	//int [] arr = new int[2];
	float maxArea = Integer.MIN_VALUE;
	
	public void maxAreaOfTriangle1(int b, int h) {
		int area1 = (b*h)/2;
		System.out.println(area1);
		//arr[0] = area1;
		maxArea = Math.max(maxArea, area1);
	}
	
	public void maxAreaOfTriangle2(int b, int h) {
		int area2 = (b*h)/2;	
		System.out.println(area2);
		//arr[1] = area2;
		maxArea = Math.max(maxArea, area2);
		System.out.println("Max area through Math.max function: "+maxArea);
		
//		if(arr[0] < arr[1]) {
//			System.out.println("Maximum area is: "+arr[1]);
//		} else if(arr[0] > arr[1]) {
//			System.out.println("Maximum area is: "+arr[0]);
//		} else {
//			System.out.println("Both area is same that is: "+arr[0]);
//		}
    }
    
	public static void main(String[] args) {
		Max_Area_of_Two_Triangles ob = new Max_Area_of_Two_Triangles();
		ob.maxAreaOfTriangle1(3, 1);
		ob.maxAreaOfTriangle2(5, 1);
		
	}
}

