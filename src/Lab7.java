/*
 * Kassondra Jones
 * Not finished -- this is as far as I got sadly
 * January 30, 2018
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

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

		try {
			System.out.println("Enter a number 1-20:  ");
			int userNum = scan.nextInt();

			if (userNum >= 1 && userNum <= 20) {
				System.out.println(userNum);
				
				//I DONT KNOW HOW TO MAKE THESE INTO METHODS... SOS... PLEASE SEND HELP
				for (int i = 0; i < studentNum.length; i++)
					System.out.println("Student " + studentNum[i] + " is " + studentName[i]
							+ ".  What would you like to know about " + studentName[i] + "?");

				for (int i = 0; i < studentNum.length; i++)

					System.out.println(studentName[i] + "'s hometown is " + studentHometown[i] + ".");
				
				for (int i = 0; i < studentNum.length; i++)

					System.out.println(studentName[i] + "'s favorite food is " + studentFood[i] + ".");

			} else {
				System.out.println("That student does not exist.  Please try again.");
			}
		} catch (InputMismatchException exception) {
			System.out.println("This is not a valid number.  Please try again.");
		}


	 scan.close();

	 System.out.println("Thanks!");

	 scan.close();


}
	
	public static String getStudentName (int userNum) {

		
	return " ";
	}
	
	public static String getStudentHometown (String studentName) {

		
	return " ";
	}
	
	public static String getStudentFood (String studentName) {
		
	return " ";
	}
	
	
	
}

