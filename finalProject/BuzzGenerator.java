package FinalStuff;

public class BuzzGenerator {
	short[] numbers;
	
	// constructor
	public BuzzGenerator(int length) {
		numbers = new short[length];
		generate();
	}
	
	public void generate() {
        int current = 1;
        int found = 0;
        while (found < numbers.length) {
            if (current % 7 == 0 || current % 10 == 7) {
                numbers[found++] = (short) current;
            }
            current++;
        }
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

