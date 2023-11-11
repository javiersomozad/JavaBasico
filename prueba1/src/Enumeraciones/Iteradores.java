package Enumeraciones;
import java.util.*; // imports ArrayList, Collection and Iterator

public class Iteradores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> ejem = new ArrayList<String>();

	    ejem.add("Item 1");
	    ejem.add("Item 2");
	    ejem.add("Item 3");
	    ejem.add("Item 4");

	    Iterator<String> iterator = ejem.iterator();
		while (iterator.hasNext()) {
		   System.out.println("Element Value= " + iterator.next());
		}
		
		for (iterator = ejem.iterator(); iterator.hasNext();) {
			  System.out.println("Element II Value= " + iterator.next());
		}
		
		for (String s : ejem) {
			  System.out.println("Element III Value= " + s);
		}
	}
}
