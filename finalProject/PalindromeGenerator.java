package finalProject;
import java.util.Stack;

public class PalindromeGenerator {
	//generic stack
	Stack<Short> numbers;

	// constructor
	public PalindromeGenerator(int length) {
		numbers = new Stack<>();
		generate(length);
	}
	// generates numbers for the stack
	public void generate(int length) {
		short current = 11;
		int found = 0;
		while (found < length) {
			if (isPalindrome(current)) {
				numbers.push(current);
				found++;
			}
			current++;
		}
	}
	//makes a more specific loop to find exactly what we are looking for
	private boolean isPalindrome(short num) {
		String str = Short.toString(num);
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
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
