package apnikaksha.Encapsulation;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<25) {
			System.out.println("This age is perfect for playing cricket");
		} else {
		this.age = age;
		System.out.println("This age is not that good for playing");
	}
	
  }
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
		System.out.println("My Name is: "+name);
	}
}
