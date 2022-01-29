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
// UPCASTING DOWNCASTING////

class Machine{
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started.");
	}
	public void snap() {
		System.out.println("Photo taken.");
	}
}


public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//UPCASTING/////
		Machine machine2 = camera1;
		machine2.start();
		
		// error: machine2.snap();
		
		//DOWCASTING////
		
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
		
		
		
		// ---- CASTING NUMERICAL VALUES ----/////
//		byte byteValue = 20;
//		short shortValue = 55;
//		int intValue = 888;
//		long longValue = 23355;
//		
//		float floatValue = 8834.33f;
//		double doubleValue = 32.4;
//        
//		System.out.println(Byte.MAX_VALUE);
//		//casting
//		intValue = (int)longValue;
//		
//		System.out.println(intValue);
//		
//		doubleValue = intValue;
//		System.out.println(doubleValue);
//		
//		intValue = (int)floatValue;
//		System.out.println(intValue);
//		
//		//the following won't work as we expect to
//		// 128 is too big for a byte.
//		
//		byteValue = (byte)128;
//		System.out.println(byteValue);
//		
		
	}

}
