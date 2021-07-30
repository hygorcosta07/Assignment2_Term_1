package Assignment2;

/*
 * Assignment 2 (21S)
 * Student name: Hygor Costaa
 * due date: July, 25 2021
 * Lab Section: 313
 * lab Professor: Dave Houtman
 */

import java.util.Scanner;

/*This class is used to get user input values.
  * This is the way the user enters the values
  * program enters the system.
 * */
public class User {

	private Scanner keyboard = new Scanner(System.in);

	/*This method receives the value entered via the return of the
inputInteger(String message)
	*/
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}

	// Method used to input the bag size value.
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}
	
	/*This method receives the value entered via the return of the
inputInteger(String message)
	*/
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;
	}

	// Method used to input the bag size value.
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
	
}  

//References
//[1] Cay Horstmann. (2019). Big Java Early Objects. 7th Ed. Wiley.
