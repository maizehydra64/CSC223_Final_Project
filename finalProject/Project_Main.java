/**
 * 
 */
package finalProject;
/**
 * @author Clay Houston
 * @author Isaac Fitzwater
 * Project Due: 5/06/2024
 */

import java.util.Scanner;

public class Project_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Algorithmic Numbers Generator");
		Scanner scan = new Scanner(System.in);
		int choice = -1;
		// loops until the user exits
		while (choice != 0) {
			// Calls the selection menu
			menu();
			// input validation
			try {
				// get the user's choice
				choice = scan.nextInt();
			// catches if the user inputs anything other than an integer
			}catch (java.util.InputMismatchException e){	
				scan.next();
				choice = -1;
			}
			if(choice > 0 && choice < 10) {
				int num_gen = -1;
				// Input validation for num_gen
				// also gets the amount of numbers to generate
				while (num_gen>100|num_gen<1) {
					System.out.println("How many numbers would you like to generate (100 maximum):");
					try {
						num_gen = scan.nextInt();
					}catch (java.util.InputMismatchException e){	
						scan.next();
					}
					if(num_gen>100|num_gen<1) {
						System.out.println("Invalid Input! please enter a valid number!");
					}
				}
				switch (choice) {
					case 1:
						EvenGenerator evenGen = new EvenGenerator(num_gen);
						evenGen.flip();
						evenGen.print();
					case 2:
						BuzzGenerator buzzGen = new BuzzGenerator(num_gen);
						buzzGen.flip();
						buzzGen.print();
					case 3:
						PalindromeGenerator palGen = new PalindromeGenerator(num_gen);
						palGen.flip();
						palGen.print();
					case 4:
						continue;
					case 5:
						continue;
					case 6:
						continue;
					case 7:
						continue;
					case 8:
						continue;
					case 9:
						continue;
				}
			}else if(choice==0) {
				continue;
			}else {
				// invalid input message
				System.out.println("Invalid Number! Please enter a valid number.");
			}
		}
		// exit message
		System.out.println("Goodbye");
	}
	
	// Selection menu for the program
	public static void menu() {
		System.out.println("Algorithmic Numbers Menu:");
		System.out.println("1. Even Numbers");
		System.out.println("2. Buzz Numbers");
		System.out.println("3. Palindrome Numbers");
		System.out.println("4. Prime Numbers");
		System.out.println("5. Gapful Numbers");
		System.out.println("6. Jumping Numbers");
		System.out.println("7. Perfect Square Numbers");
		System.out.println("8. Harmonic Numbers");
		System.out.println("9. Placeholder");
		System.out.println("0. Exit");
		System.out.println("Please enter the number of your choice: ");
	}
}
