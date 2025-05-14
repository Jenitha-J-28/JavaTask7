package exceptions;

import java.util.LinkedList;
import java.util.List;

public class Listtoarray {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Welcome");
		list.add("To");
		list.add("Guvi");
		list.add("Learning");
		
		//System.out.print("List before converting to Array :" + list);
		String[] arr1 = new String[list.size()];
		for(int i=0; i<list.size(); i++)
			arr1[i] = list.get(i);
		for(String X : arr1)
			System.out.print(X + " ");
	}

}
