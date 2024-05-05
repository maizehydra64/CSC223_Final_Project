package finalProject;

import java.util.Stack;

public class EvenGenerator {

	// stack of shorts
	Stack<Short> numbers;
	
	// constructor
	public EvenGenerator(int length) {
		numbers = new Stack<>();
		generate(length);
	}
	
	// generates numbers for the stack
	public void generate(int len) {
		for(int i = 0;i<len;i++) {
			numbers.push((short) (2*(i+1)));
		}
	}
	
	// prints the stack
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
