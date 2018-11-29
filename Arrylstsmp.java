package udemy08_Arraylist_samples;

import java.util.ArrayList;

public class Arrylstsmp {

	public Arrylstsmp() {
		// TODO Auto-generated constructor stub
		arrayadd();
		}

	private ArrayList<String> array = new ArrayList<String>();

	public void arrayadd() {
		array.add("one");
		array.add("two");
		array.add("three");
		array.add("four");
		array.add("five");
	}

	public void arrayreplace() {
		array.set(array.indexOf("two"),"2");
	}
	
	public void arrayremove() {
		array.remove(array.indexOf("four"));
	}
	
	public boolean arrayfind(String number) {
		if (array.indexOf(number)>=0) {
			return true;
		}
		return false;
	}
	
	public void print() {
		for (String string : array) {
			System.out.println(string);
			
		}
	}
	
}
