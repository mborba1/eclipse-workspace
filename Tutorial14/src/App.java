/*
 * private --- only within the same class
 * public ---- from anywhere
 * protected --- same class, subclass, and same package
 * no modifier --- same package only
 */

//for importing packages 
//need to create different package 
//import ocean.*

public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		
        mach1.start();
        mach1.stop();
        
        
        Car car1 = new Car();
        
        car1.start();
        car1.wipeWindShield();
        car1.stop();
	}

}
