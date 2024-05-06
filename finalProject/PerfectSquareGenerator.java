package finalProject;

import java.util.Stack;

public class PerfectSquareGenerator {
	//generic stack
	Stack<Long> numbers;

	// constructor
	public PerfectSquareGenerator(long length) {
		numbers = new Stack<>();
		generate(length);
	}

	// generates numbers for the stack
	public void generate(long length) {
		System.out.println("Perfect Square Numbers:");
		int number = 1;
		for (int i = 0; i < length; i++) {
			long found = (number * number);
			numbers.push(found);
			number++;
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
