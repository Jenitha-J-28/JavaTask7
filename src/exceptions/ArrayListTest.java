package exceptions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> vegies = new ArrayList<>();
			vegies.add("Tomato"); //0
			vegies.add("Brinjal"); //1
			vegies.add("Drumstick"); //2
			vegies.add("Potato"); //3
			vegies.add("Carrot"); //4
		System.out.println("Vegetable List : "+ vegies);
		
		vegies.remove(0);
		System.out.println("Vegetable List after removing one vegitable : "+ vegies);
		vegies.remove(1);
		System.out.println("Vegetable List after removing two vegitable : "+ vegies);
		vegies.remove(2);
		System.out.println("Vegetable List after removing three vegitable : "+ vegies);
		vegies.remove(0);
		System.out.println("Vegetable List after removing four vegitable : "+ vegies);
		vegies.remove(0);
		System.out.println("Vegetable List after removing five vegitable : "+ vegies);
	}

}
