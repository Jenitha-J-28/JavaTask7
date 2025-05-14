package exceptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TreeMapSort {

	public static void main(String[] args) {
	TreeMap<String, String> treemap = new TreeMap<>();
	treemap.put("234", "David");
	treemap.put("294", "Analya");
	treemap.put("934", "Kevin");
	treemap.put("735", "Johan");
	treemap.put("120", "Rohan");
	treemap.put("255", "Prasanna");

	List<String>nameList = new ArrayList<>(treemap.values());
	Collections.sort(nameList);
	for (String i : nameList) {
		System.out.println(i);
	}
	
}

}
