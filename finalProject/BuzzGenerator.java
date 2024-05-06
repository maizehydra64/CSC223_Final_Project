package finalProject;

import java.util.Stack;

public class BuzzGenerator {

	//generic stack
	Stack<Short> numbers;

	// constructor
	public BuzzGenerator(int length) {
		numbers = new Stack<>();
		generate(length);
	}
	//Uses math to cycle through what numbers best fit this Algorithm
	public void generate(int length) {
		short current = 1;
		int found = 0;
		while (found < length) {
			if (current % 7 == 0 || current % 10 == 7) {
				numbers.push(current);
				found++;
			}
			current++;
		}
	}
	// prints the list
	public void print() {
		while(!numbers.isEmpty()) {
			System.out.print(numbers.pop());
			if(!numbers.isEmpty()) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
