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
	
	@Test
	public void shouldReturnFizzIfInputIsMultipleOfThree() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actual = fizzbuzz.test(3);
		Assert.assertEquals("Fizz", actual);
	}
	
	@Test
	public void shouldReturnFizzIfInputIsMultiplesOfThree() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actual = fizzbuzz.test(9);
		Assert.assertEquals("Fizz", actual);
	}
	@Test
	public void shouldReturnNumberIfNotMultipleOfThree() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actual = fizzbuzz.test(2);
		Assert.assertEquals("2", actual);
	}
	
	@Test
	public void shouldReturnBuzzIfInputIsFive() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actual = fizzbuzz.test(5);
		Assert.assertEquals("Buzz", actual);
	}
	
	@Test
	public void shouldReturnFizzIfInputIsMultipleOfFive() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String actual = fizzbuzz.test(25);
		Assert.assertEquals("Buzz", actual);
	}
}
