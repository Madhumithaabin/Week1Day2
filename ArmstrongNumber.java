package Assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quotient, input, remainder, number, result;
		input = 153;
		number = input;
		result = 0;
		while (number > 0) {
			quotient = number / 10;
			remainder = number % 10;
			result += (remainder * remainder * remainder);
			number = quotient;

		}
		if (input == result) {
			System.out.println(input + " is a Armstrong Number");
		} else {
			System.out.println(input + " is not a Armstrong Number");
		}
	}

}
