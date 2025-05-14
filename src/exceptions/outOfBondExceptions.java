package exceptions;

public class outOfBondExceptions {

	static int[] num = {4,5,6,7,8};
	static String str = "Guvi";
	
	public static void main(String[] args) {
		try {
			System.out.println("Print the Element : " + num[5]);
		}catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException Exception Occured : "+ e.getMessage());
		}
		try {
			System.out.println("Print the text : "+ str.charAt(4));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException Occured : "+ e.getMessage());
		}
	}

}
