package test;
import org.junit.Assert;
import org.junit.Test;
import main.FizzBuzz;

/* Write a program that has one method test(int value)
 * For multiples of three print "Fizz" instead of the
 * number.  For multiples of five print "Buzz".  
 * Anything else simply returns the number.
 */

public class FizzBuzzTest {
	
	@Test
	public void shouldReturnAFizzBuzzClassWhenCalled() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		Assert.assertNotNull(fizzBuzz);
	}
}
