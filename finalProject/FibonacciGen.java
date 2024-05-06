package finalProject;

import java.util.Stack;

public class FibonacciGen {
	
	// stack of shorts
	Stack<Double> numbers;
	
	// constructor
	public FibonacciGen(int length) {
		numbers = new Stack<>();
		generate(length);
	}
	
	// generates numbers for the stack
	public void generate(int len) {
		for(int i = 0;i<len;i++) {
			if(i<=1) {
				// pushes the first 2 ones to the stack
				numbers.push(1.0);
			}
			else{
				// removes the top number to look below it
				// then returns it and adds those two together
				// and pushes the sum to the stack
				double top = numbers.pop();
				double temp = numbers.peek();
				numbers.push(top);
				numbers.push(top+temp);
			}
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
