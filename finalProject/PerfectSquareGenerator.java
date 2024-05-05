package FinalStuff;

public class PerfectSquareGenerator {

	private long[] numbers;

	public PerfectSquareGenerator(int length) {
		numbers = new long[length];
		generate(length);
	}
	public void generate(long length) {
		System.out.println("Perfect Square Numbers:");
		int number = 1;
		for (int i = 0; i < length; i++) {
			System.out.print(number * number + " ");
			number++;
		}
	}

	public void flip() {
		int len = numbers.length;
		long[] tempList = new long[len];
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
