class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id =id;
		this.name =name;
	}
	
	public String toString() {
		
		return String.format("%d: %s", id, name);
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(id).append(": ").append(name);
//		return sb.toString();
		//return id + ": " + name; //inefficient
		
		
	}
}

public class App {

	public static void main(String[] args) {
		
		//toString method
		
		Frog frog1 = new Frog(7, "Freddy");
		
		System.out.println(frog1);
		
//	
//		
//		StringBuilder sb = new StringBuilder("");
//		
////		sb.append("My name is Sue.");
////		sb.append(" ");
////		sb.append("I am a lion tamer.");
//		
//		//or could do this
//		
//		sb.append("My name is Sue.").append(" ").append("I am a lion tamer.");
//		
//		System.out.println(sb.toString());
//		
//		
//		///////Formatting ////////
//		
//		System.out.print("here is some text.\tThat was a tab.\nThat was a newline\n");
//		
//		///Formatting integers
//		System.out.printf("Total cost %d; quantity is %d\n", 5, 120);
//		
//		for(int i=0; i< 20; i++) {
//			System.out.printf("%-2d: %s\n", i, "here is some text");
//		}
//        //Formatting floating point value
//		System.out.printf("Total value: %-6.1f\n", 343.23423);
 }

}
