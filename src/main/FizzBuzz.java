package main;

public class FizzBuzz {

	public String test(int value) {
		if (value % 3 == 0) {
			return "Fizz";
		} else {
			return String.valueOf(value);
		}
	}

}
