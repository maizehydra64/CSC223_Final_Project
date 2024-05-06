package finalProject;

import java.util.Stack;

public class PrimeGenerator {
	//generic stack
	Stack<Integer> numbers;

	// constructor
	public PrimeGenerator(int length) {
		numbers = new Stack<>();
		generate(length);
	}
	// generates numbers for the stack
	public void generate(int length) {
		int found = 0;
		int current = 2;
		while (found < length) {
			if (isPrime(current)) {
				numbers.push(current);
				found++;
			}
			current++;
		}
	}
	//makes a more specific loop to find exactly what we are looking for
	private boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
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
