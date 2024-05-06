package finalProject;

import java.util.Stack;

public class JumpingGenerator {
	Stack<Integer> numbers;
	public JumpingGenerator(int length) {
		numbers = new Stack<>();
		generate(length);
	}
	
	public void generate(int length) {
        numbers = new Stack<>();
        int found = 0;
        int current = 10; // Start from 10 to ensure 2-digit numbers
        while (found < length) {
            if (isJumping(current)) {
                 numbers.push(current);
                 found++;
            }
            current++;
        }
    }
	
	private boolean isJumping(int num) {
        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length() - 1; i++) {
            int digit1 = Character.getNumericValue(strNum.charAt(i));
            int digit2 = Character.getNumericValue(strNum.charAt(i + 1));
            if (Math.abs(digit1 - digit2) != 1) {
                return false;
            }
        }
        return true;
    }

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
