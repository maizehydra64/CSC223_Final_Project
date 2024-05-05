package finalProject;

public class PalindromeGenerator {
	short[] numbers;

	public PalindromeGenerator(int length) {
		numbers = new short[length];
		generate();
	}

	public void generate() {
		short current = 11;
		int found = 0;
		while (found < numbers.length) {
			if (isPalindrome(current)) {
				numbers[found++] = current;
			}
			current++;
		}
	}

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

	// flips the list
	public void flip() {
		int len = numbers.length;
		short[] tempList = new short[len];
		for(int i = 0;i<len;i++) {
			tempList[i] = numbers[len-(i+1)];
		}
		numbers = tempList;
	}

	// prints the list
	public void print() {
		for(int i = 0; i < numbers.length;i++) {
			System.out.print(numbers[i]);
			if(i!=numbers.length-1) {
				System.out.print(", ");
			}
		}
	}
}
