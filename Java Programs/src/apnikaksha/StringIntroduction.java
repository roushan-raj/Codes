package apnikaksha;

public class StringIntroduction {

	public static void main(String[] args) {
		
		String name = "Roushan";                  // String formation by Literals
		String myName = new String ("Roushan");   // String formation by Object
		System.out.println(myName == name);

        String name1 = "Raaz";
        String name2 = "Raaz";
        System.out.println(name1 == name2);
        
        String str = "        Roushan       ";
        String jaan = "Shivangi Srivastava";
        String lichi = "Shivangi Srivastava";
        System.out.println(jaan.charAt(0));
        System.out.println(jaan.length());
        System.out.println(jaan.substring(5));
        System.out.println(jaan.substring(9,19));
        System.out.println(jaan.contains("Shivangi"));
        System.out.println(jaan.equals(lichi));
        System.out.println(jaan.isEmpty());
        System.out.println(jaan+" "+lichi);
        System.out.println(jaan.concat(" Roushan Raj"));
        System.out.println(jaan.replace('S', 'R'));
        System.out.println(jaan.indexOf("h"));
        System.out.println(jaan.toLowerCase());
        System.out.println(jaan.toUpperCase());
        System.out.println(str.trim());
        
        String cars = "Lamborgini,Buggati,Ferrari,Auston Martin,Porsche,Audi,BMW,Mersedes";
        String allCars[] = cars.split(",");   // you can write diff characters in " " in this line like "a"  ,"ar" .....etc
        
        for(String car: allCars) {
        	System.out.println(car);
        }
        

	}

}
