package Assignment2;
/*
 * Assignment 2 (21S)
 * Student name: Hygor Costaa
 * due date: July, 25 2021
 * Lab Section: 313
 * lab Professor: Dave Houtman
 */

import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {

		int goodBag = 0;
		int badBag = 0;
		String mustContinueExecution = "";

		// Object - Instanciando os Objetos
		User bagMethod = new User();
		PotatoChipBag bag = new PotatoChipBag();
		Scanner keyboard = new Scanner(System.in);

		do {
			bag.setSize(bagMethod
					.inputInteger("Enter Bag Size" + "\n" + "1 - for Regular Size" + "\n" + "2 - for Large Size"));
			if (bag.getSize() > bag.LARGE || bag.getSize() < bag.REGULAR) {

				System.out.println("Invalid Size");

			} else {
				bag.setWeight(bagMethod.inputDouble("Enter weight "));

				if (bag.isBagCorrectWeight() == true) {
					goodBag++;
				} else {
					badBag++;

				}

				System.out.println("Good Bags: " + goodBag + "\n" + "Bad Bags: " + badBag + "\n" + "TOTAL: "
						+ Math.addExact(goodBag, badBag));

			}
			System.out.println("Continue the Program ? ( Y/N )");
			mustContinueExecution = keyboard.next();

		} while (mustContinueExecution.equalsIgnoreCase("Y"));

		System.out.println("Program has shut down");
		System.out.println("Program by Hygor Costa");

	}

}
