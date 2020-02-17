package asmdCalculator;

import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char repeat;  // Holds 'y'
		
		do {
			Scanner keyboardInput = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			double num1 = keyboardInput.nextDouble();
			
			System.out.print("Enter an operator: ");
			String op = keyboardInput.next();
			
			System.out.print("Enter second number: ");
			double num2 = keyboardInput.nextDouble();
			
			if(op.equals("+")) {
				System.out.println( "The answer is " + (num1 + num2 ));
			} else if(op.contentEquals("-")) {
				System.out.println( "The answer is " + (num1 - num2 ));
			} else if(op.equals("*")) {
				System.out.println( "The answer is " + num1 * num2 );
			} else if(op.equals("/")) {
				System.out.println( "The answer is " + num1 / num2 );
			} else {
				System.out.println("Operator is invalid.");
			}
			
			// Does the user want another calculation?
			System.out.println("Would you like another calculation?");
			System.out.print("Enter Y for yes or N for no: ");
			
			String input = keyboardInput.next(); // Read line.
			repeat = input.charAt(0);
			
		} while (repeat == 'Y' || repeat == 'y');
		
	}
}
