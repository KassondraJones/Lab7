
/*
 * Kassondra Jones
 * January 30, 2018
 * Lab 7
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userResponse = "y";

		System.out.println("Welcome to our Java class.\nWhich student would you like to learn more about?");

		int[] studentNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		String[] studentName = { "John", "Jessica", "Amy", "Michael", "Terry", "Sarah", "Alex", "Emily", "Justin",
				"Brian", "Aaron", "Ava", "Sienna", "Nikki", "Lydia", "Christian", "Everett", "Mark", "Brett",
				"Sterling" };
		String[] studentHometown = { "Detroit", "Canton", "Novi", "Ann Arbor", "Southgate", "Detroit", "Canton", "Novi",
				"Ann Arbor", "Southgate", "Detroit", "Canton", "Novi", "Ann Arbor", "Southgate", "Detroit", "Canton",
				"Novi", "Ann Arbor", "Southgate" };
		String[] studentFood = { "Pizza", "Tacos", "Pasta", "Salad", "BBQ", "Pizza", "Tacos", "Pasta", "Salad", "BBQ",
				"Pizza", "Tacos", "Pasta", "Salad", "BBQ", "Pizza", "Tacos", "Pasta", "Salad", "BBQ", "Pizza", "Tacos",
				"Pasta", "Salad", "BBQ" };

		do {
			try {
				// For loop to display student numbers and names
				for (int i = 0; i < studentNum.length; i++) {
					System.out.print(studentNum[i] + "\t");
					System.out.println(studentName[i] + "\t");
				}
				System.out.println(" ");
				System.out.println("Enter the corresponding number 1-20:  ");
				int userNum = scan.nextInt();

				// If statement to validate the number enter is within the given range
				if (userNum >= 1 && userNum <= 20) {
					int i = userNum - 1;

					System.out.println("Student " + studentNum[i] + " is " + studentName[i] + ".  " + studentName[i]
							+ "'s hometown is " + studentHometown[i] + " and " + studentName[i] + "'s favorite food is "
							+ studentFood[i] + ".");
					scan.nextLine();

				} else {
					// Response if the number entered is out of bounds and doesn't correspond to a
					// student
					System.out.println("That student does not exist.  Please try again.");
					scan.nextLine();
				}

			} catch (InputMismatchException exception) {
				// This catch appears if a user does not enter a valid response i.e. a letter
				// instead of a number
				System.out.println("This is not a valid number.  Please try again.");
				scan.nextLine();
			}

			System.out.println(" ");
			System.out.println("Would you like to learn about a different student?  (y/n):");
			userResponse = scan.nextLine();

		} while (userResponse.equalsIgnoreCase("y"));

		System.out.println(" ");
		System.out.println("Thanks for your time!\nI hope you learned a lot about our class!");

		scan.close();

	}

}
