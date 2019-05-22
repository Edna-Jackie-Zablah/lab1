// Author: Edna Jaqueline Zablah
// date: 05/22/2019
// Java Deliverable 1 - What to Eat

package lab1;

import java.util.Scanner;

public class whatToEat {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int eventType;
		int partySize;
		String result;
		String userInput;
		String preparation;
		int i;

		eventType = 0;
		partySize = 0;
		result = "";
		userInput = "";
		preparation = "";

		i = 0;
		while (i == 0) {
			System.out.print("Please enter the kind of event (1 for casual, 2 for semi-formal, 3 for formal): ");
			System.out.println();
			System.out.print("Enter only numbers from 1 to 3: ");

			while (!scnr.hasNextInt()) {
				System.out.print("That's not a valid option! Try again: ");
				scnr.next();

			}
			eventType = scnr.nextInt();

			if (eventType == 1) {
				result = "sandwiches";
				userInput = "casual";
				i++;
			} else if (eventType == 2) {
				result = "fried chicken";
				userInput = "semi-formal";
				i++;
			} else if (eventType == 3) {
				result = "chicken parmesan";
				userInput = "formal";
				i++;
			} else {
				i = 0;
			}
		}

		i = 0;
		while (i == 0) {
			System.out.println();
			System.out.print("Please enter the size of the party: ");
			partySize = scnr.nextInt();
			System.out.println();

			if (partySize == 1) {
				preparation = "in the microwave";
				i++;
			} else if ((partySize > 1) && (partySize < 13)) {
				preparation = "in your kitchen";
				i++;
			} else if (partySize > 13) {
				preparation = "by a caterer";
				i++;
			} else {
				System.out.print("That's an invalid size. Try again.");
			}

		}
		System.out.println();
		System.out.println("Since you’re hosting a " + userInput + " event for " + partySize
				+ " participants, you should serve " + result + " " + preparation + ".");

		scnr.close();
	}

}
