package finalProject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class GeneratorTest {
	
	@Test
	public void testEvenGenerator() {
		EvenGenerator evenGen = new EvenGenerator(5);
		Stack<Short> test = new Stack<>();
		List<Short> temp = Arrays.asList((short)2,(short)4,(short)6,(short)8,(short)10);
		test.addAll(temp);
		assertEquals(test,evenGen.numbers);
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
