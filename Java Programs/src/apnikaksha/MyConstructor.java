package apnikaksha;

class Vehicle {
	int wheels;
	Vehicle() {                                       // Non Parametrised constructor
		wheels = 4;
	}
}

class Truck {
	int wheels;
	int headLights;
	String color;
    Truck(int wheels) {                                // Parametrised constructor
		this.wheels = wheels;
		headLights = 2;
	}
    Truck (int wheels, String color)  {                
    	this.wheels = wheels;                           // Use of this keyword
    	this.color = color;
    	headLights = 2;
    }
}

public class MyConstructor {
      MyConstructor() {
    	  System.out.println("object is now created");
      }

	public static void main(String[] args) {
		 
		MyConstructor o1 = new MyConstructor();
		
		Vehicle car = new Vehicle();
		Vehicle car2 = new Vehicle();
		System.out.println(car.wheels+" wheels");
		System.out.println(car2.wheels+" wheels");
		
		Truck t1 = new Truck(6);
		System.out.println(t1.wheels+" wheels");
		System.out.println(t1.headLights+" headLights");
		
		Truck t2 = new Truck(4,"black");
		System.out.println(t2.wheels+" wheels");
		System.out.println(t2.color+" color");
		System.out.println(t2.headLights+" headLights");
		
		

	}

}
