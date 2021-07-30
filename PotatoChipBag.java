package Assignment2;
/*
 * Assignment 2 (21S)
 * Student name: Hygor Costaa
 * due date: July, 25 2021
 * Lab Section: 313
 * lab Professor: Dave Houtman
 */

/* Declaration of all variables, for future
  * changes in values just change directly
  * the variable.
 */
public class PotatoChipBag {
	private int size;
	private double weight; // oz
	public static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; // oz
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75; // oz

	// Declaration of tolerance through variable.
	private static final double EPSILON = 0.01;

//CONSTRUCTOR - Using the values already declared in the variable.
	public PotatoChipBag() {
		this(REGULAR, REGULAR_WEIGHT);
	}

	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}

	// Method to get the value the user has entered.
	public int getSize() {
		return size;
	}

	// Method used to enter the value the user entered.
	public void setSize(int size) {
		this.size = size;
	}

	// Method to get the value the user has entered.
	public double getWeight() {
		return weight;
	}

	// Method used to enter the value the user entered.
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * BOOLEAN METHOD "FALSE OR TRUE" This method was written to have a return of
	 * false or true depending on the weight of the package, through the value
	 * informed tolerance, and always using the variables to automate future
	 * changes.
	 */

	public boolean isBagCorrectWeight() {
		boolean result = false;

		if (this.getSize() == REGULAR) {
			if ((this.getWeight() == REGULAR_WEIGHT - EPSILON) || (this.getWeight() == REGULAR_WEIGHT + EPSILON)
					|| (this.getWeight() == REGULAR_WEIGHT)) {
				result = true;
			} else {
				result = false;
			}

		} else if (this.getSize() == LARGE) {
			if ((this.getWeight() == LARGE_WEIGHT - EPSILON) || (this.getWeight() == LARGE_WEIGHT + EPSILON)
					|| (this.getWeight() == LARGE_WEIGHT)) {
				result = true;
			}

		}

		return result;
	}

}

//References
//[1] Cay Horstmann. (2019). Big Java Early Objects. 7th Ed. Wiley.

