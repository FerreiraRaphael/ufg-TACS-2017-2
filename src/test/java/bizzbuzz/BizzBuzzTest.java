package bizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class BizzBuzzTest {

	@Test
	public void testFizz() {
		assert(BizzBuzz.jogar(12) == "Fizz");
	}

	@Test
	public void testBuzz() {
		assert(BizzBuzz.jogar(20) == "Buzz");
	}
	
	
	@Test
	public void testFizzBuzz() {
		assert(BizzBuzz.jogar(30) == "FizzBuzz");
	}
	
	@Test
	public void testContinua() {
		assert(BizzBuzz.jogar(13) == "Continua");
	}
}
