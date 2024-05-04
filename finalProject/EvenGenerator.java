package finalProject;

public class EvenGenerator {

	// list of shorts
	short[] numbers;
	
	// constructor
	public EvenGenerator(int length) {
		numbers = new short[length];
		generate();
	}
	
	// generates numbers for the list
	public void generate() {
		for(int i = 0;i<numbers.length;i++) {
			numbers[i]=(short) (2*(i+1));
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
