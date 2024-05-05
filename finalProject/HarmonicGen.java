package finalProject;

import java.util.Stack;

public class HarmonicGen {
	
	// stack of shorts
	Stack<Integer> numbers;
		
	// constructor
	public HarmonicGen(int length) {
		numbers = new Stack<>();
		generate(length);
	}
	
	// generates numbers for the stack
	public void generate(int len) {
		int iter = 1;
		while(numbers.size()<len) {
			// converts temp to a string
			String temp = Integer.toString(iter);
			int sum = 0;
			int prod = 1;
			// iterates through every character in temp
			for(int i = 0;i<temp.length();i++) {
				// gets the numerical value of the character in the string
				// adds it to sum and and multiplies prod by it
				sum += Character.digit(temp.charAt(i),10);
				prod *= Character.digit(temp.charAt(i),10);
			}
			// checks if sum and prod are equal
			if(sum==prod) {
				// pushs iter to numbers
				numbers.push(iter);
			}
			// iterates iter
			iter++;
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
