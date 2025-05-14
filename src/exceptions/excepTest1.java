package exceptions;

import java.util.Scanner;

public class excepTest1{
	static int i;
	static int j;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of i : ");
		i  =scanner.nextInt();
		System.out.println("Enter the value of j : ");
		j = scanner.nextInt();
		try {
			int Result = i/j;
			System.out.println("The Result is : "+ Result);
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception divide by zero accured :" + e.getMessage());
		}
		

	}

}
