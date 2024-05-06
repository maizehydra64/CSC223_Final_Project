package finalProject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratorTest {
	
	@Test
	public void testEvenGenerator() {
		EvenGenerator evenGen = new EvenGenerator(10);
		Stack<Short> test = new Stack<>();
		int[] temp_int = [2,4,6,8,10,12,14,16,18,20];
		short[] temp = Arrays.copyOf(temp_int,10,Class<>());
		test.addAll(temp);
		assertEquals()
	}
	
	@Test
	public void testBuzzGenerator() {
		
	}
	
	@Test
	public void testPalindromeGenerator() {
		
	}
	
	@Test
	public void testPrimeGenerator() {
		
	}
	
	@Test
	public void testGapfulGenerator() {
		
	}
	
	@Test
	public void testJumpingGenerator() {
		
	}
	
	@Test
	public void testSquaresGenerator() {
		
	}
	
	@Test
	public void testHarmonicGenerator() {
		
	}
	
	@Test
	public void testFibonacciGenerator() {
		
	}
}
