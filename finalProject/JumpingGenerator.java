package FinalStuff;

public class JumpingGenerator {
	private int[] numbers;
	public JumpingGenerator(int length) {
		numbers = new int[length];
		generate(length);
	}
	
	public void generate(int length) {
        numbers = new int[length];
        int found = 0;
        int current = 10; // Start from 10 to ensure 2-digit numbers
        while (found < length) {
            if (isJumping(current)) {
                numbers[found++] = current;
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
	
	public void flip() {
        int len = numbers.length;
        int[] tempList = new int[len];
        for (int i = 0; i < len; i++) {
            tempList[i] = numbers[len - (i + 1)];
        }
        numbers = tempList;
    }

    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
