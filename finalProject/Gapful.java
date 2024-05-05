package finalProject;

import java.util.Stack;

public class Gapful {

	// stack of shorts
		Stack<Integer> numbers;
		
		// constructor
		public Gapful(int length) {
			numbers = new Stack<>();
			generate(length);
		}
		
		// generates numbers for the stack
		public void generate(int len) {
			int iter = 100;
			while(numbers.size()<len) {
				// raises 10 to the floor of log10 of iter to get the the size of the number
				int left_pos = (int)Math.pow(10,Math.floor(Math.log10(iter)));
				// performs integer division on iter using left_pos
				// then multiplies it by 10 to get the left most digit
				int left_num = 10*(iter/left_pos);
				// mods iter by 10 to get the right most digit
				int right_num = iter%10;
				// adds the two together to get the divisor
				int concat = left_num+right_num;
				// checks if iter can be divided evenly by concat
				if(iter%concat==0) {
					// pushes iter to numbers
					numbers.push(iter);
				}
				// adds 1 to iter
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
