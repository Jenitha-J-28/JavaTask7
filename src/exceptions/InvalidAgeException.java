package exceptions;

public class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}

	public static void agevalidation(int age) throws InvalidAgeException {
		if (age>=18) {
			System.out.println("Valid age to proceed");
		}else {
			throw new InvalidAgeException("Your age is below 18, Its Invalid Age");
		}
	}
	public static void main(String[] args) throws InvalidAgeException{
		agevalidation(10);

	}

}
