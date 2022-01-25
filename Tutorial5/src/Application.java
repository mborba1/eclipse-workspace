import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
//	  for(int i =0; i < 5; i++) {
//		
////		System.out.println("Hello");
//		System.out.printf("The value of i is:  %d\n", i);
////		System.out.println();
//	  }
		
		//conditionals
		
//		int myInt = 20;
//		
//		if(myInt < 20) {
//			System.out.println("Yes, it's true!");
//		}
//		else if(myInt > 20) {
//			System.out.println("No, it's false!");
//		}
//		else {
//			System.out.println("None of the above.");
//		}
		
		//getting user input
		//create scanner object
		Scanner input = new Scanner(System.in);
//		
//		//output the prompt
//		System.out.println("Enter a floating point value: ");
//		
//		//wait for the user to enter a new line of text
//		//String line = input.nextLine();
//		
//		//wait for user input using integer
//		//int value = input.nextInt();
//		
//		double value = input.nextDouble();
//		
//		//Tell them what they entered.
//		System.out.println("You entered: " + value);
		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = input.nextInt();
		}
		while(value !=5);
		
		System.out.println("Got 5!");
		
	}
}
