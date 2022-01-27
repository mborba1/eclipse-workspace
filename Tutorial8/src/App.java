
class Person {
	//Instance variables (data or "state")
	
	String name;
	int age;
	
	//classes can contain
	//1.Data
	//2.Subsroutines (methods)
	
	void speak() {
		System.out.println("My name is: " + name + " and I am " + age + " years old ");
	}
	void sayHello() {
		System.out.println("hello there!");
	}
	int calculateYeardToRetirement() {
		int yearsLeft = 65 - age;
//		System.out.println(yearsLeft);
		
		return yearsLeft;
	}
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		//person1.sayHello();
		int years = person1.calculateYeardToRetirement();	
		int age = person1.getAge();
		
//		Person person2 = new Person();
//		person2.name = "Sarah Smith";
//		person2.age = 20;
//		person2.speak();
		//person2.calculateYeardToRetirement();
		
		//System.out.println(person1.name);
		System.out.println("Name is: " + person1.getName());
	}

}
