
public class Maxi_Area_of_Rectangle {
	
	public int area(float perimeter) {
		
		int length = (int) Math.ceil(perimeter/4);
		int breadth = (int) Math.floor(perimeter/4);
		
		return length * breadth;
	}

	public static void main(String[] args) {
		Maxi_Area_of_Rectangle ob = new Maxi_Area_of_Rectangle();
		System.out.println("Maximum possible area is: "+ob.area(14));
	}
}
