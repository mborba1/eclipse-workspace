class Thing{
	public String name; //instance variables
	public static String description; //class variables
	
	public void showName() { //instance method
		System.out.println(description + ": " + name);
		
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
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
//		System.out.println(thing1.name);
//		System.out.println(thing2.name);
		
	}

}
