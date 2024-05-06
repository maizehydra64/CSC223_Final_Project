package finalProject;

import org.junit.jupiter.api.Test;
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
		BuzzGenerator buzzGen = new BuzzGenerator(5);
		Stack<Short> test = new Stack<>();
		List<Short> temp = Arrays.asList((short)7,(short)14,(short)17,(short)21,(short)27);
		test.addAll(temp);
		assertEquals(test,buzzGen.numbers);
	}
	
	@Test
	public void testPalindromeGenerator() {
		PalindromeGenerator palGen = new PalindromeGenerator(5);
		Stack<Short> test = new Stack<>();
		List<Short> temp = Arrays.asList((short)11,(short)22,(short)33,(short)44,(short)55);
		test.addAll(temp);
		assertEquals(test,palGen.numbers);
	}
	
	@Test
	public void testPrimeGenerator() {
		PrimeGenerator primeGen = new PrimeGenerator(10);
		Stack<Integer> test = new Stack<>();
		List<Integer> temp = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23,29);
		test.addAll(temp);
		assertEquals(test,primeGen.numbers);
	}
	
	@Test
	public void testGapfulGenerator() {
		Gapful gapfulGen = new Gapful(10);
		Stack<Integer> test = new Stack<>();
		List<Integer> temp = Arrays.asList(100, 105, 108, 110, 120, 121, 130, 132, 135, 140);
		test.addAll(temp);
		assertEquals(test,gapfulGen.numbers);
	}
	
	@Test
	public void testJumpingGenerator() {
		JumpingGenerator jumpGen = new JumpingGenerator(10);
		Stack<Integer> test = new Stack<>();
		List<Integer> temp = Arrays.asList(10, 12, 21, 23, 32, 34, 43, 45, 54, 56);
		test.addAll(temp);
		assertEquals(test,jumpGen.numbers);
	}
	
	@Test
	public void testSquaresGenerator() {
		PerfectSquareGenerator square = new PerfectSquareGenerator(5);
		Stack<Long> test = new Stack<>();
		List<Long> temp = Arrays.asList((long)1,(long) 4,(long) 9,(long) 16,(long) 25);
		test.addAll(temp);
		assertEquals(test,square.numbers);
	}
	
	@Test
	public void testHarmonicGenerator() {
		HarmonicGen harmGen = new HarmonicGen(5);
		Stack<Long> test = new Stack<>();
		List<Long> temp = Arrays.asList((long)1,(long) 2,(long) 3,(long) 4,(long) 5);
		test.addAll(temp);
		assertEquals(test,harmGen.numbers);
	}
	
	@Test
	public void testFibonacciGenerator() {
		FibonacciGen fiboGen = new FibonacciGen(10);
		Stack<Double> test = new Stack<>();
		List<Double> temp = Arrays.asList(1.0, 1.0, 2.0, 3.0, 5.0, 8.0, 13.0, 21.0, 34.0, 55.0);
		test.addAll(temp);
		assertEquals(test,fiboGen.numbers);
	}
}
