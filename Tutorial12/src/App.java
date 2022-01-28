class Thing{
	public final static int LUCKY_NUMBER = 7; //final is java version of constant, cannot be re-assigned
	
	public String name; //instance variables
	public static String description; //class variables
	
	public static int count = 0;
	
	public int id;
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName() { //instance method
		System.out.println("Object id: " + id + ", " + description + ": " + name);
		
	}
	public static void showInfo() { //class method
		System.out.println(description); //this works because I am outputting the static variable
		//won't work: System.out.println(name); static methods can't access instance variables
	}
}
public class App {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		//System.out.println(Thing.description);
		
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
//		System.out.println(thing1.name);
//		System.out.println(thing2.name);
		
		//System.out.println(Math.PI); //cannot be re-assigned it's a constant 
		//System.out.println(Thing.LUCKY_NUMBER);
		
	}

}
