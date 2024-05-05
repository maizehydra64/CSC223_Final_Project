package FinalStuff;

public class PrimeGenerator {
	private int[] numbers;
	
	public PrimeGenerator(int length) {
		numbers = new int[length];
		generate(length);
	}
	
	public void generate(int length) {
        numbers = new int[length];
        int found = 0;
        int current = 2;
        while (found < length) {
            if (isPrime(current)) {
                numbers[found++] = current;
            }
            current++;
        }
    }
	
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
