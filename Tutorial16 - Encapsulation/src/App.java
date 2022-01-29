//----- ENCAPSULATION ----------//

//class Plant{
//	private String name;
//
//	//The idea of encapsulation is that you encapsulate the inner workings of a class, 
//	
//	//use getters or setters to make it accessible outside the class
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//	
//	
//}

// ---- CASTING NUMERICAL VALUES ----/////
public class App {

	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.33f;
		double doubleValue = 32.4;
        
		System.out.println(Byte.MAX_VALUE);
		//casting
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		//the following won't work as we expect to
		// 128 is too big for a byte.
		
		byteValue = (byte)128;
		System.out.println(byteValue);
	}

}
