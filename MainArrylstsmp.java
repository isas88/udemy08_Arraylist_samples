package udemy08_Arraylist_samples;

public class MainArrylstsmp {
	
	public static void main(String[] args) {
		
		Arrylstsmp arrayclass = new Arrylstsmp();
		
		arrayclass.print();
		System.out.println("xxxxxxxxxxxxxxxx");
		arrayclass.arrayadd();
		arrayclass.print();
		System.out.println("xxxxxxxxxxxxxxxx");
		arrayclass.arrayremove();
		arrayclass.arrayreplace();
		arrayclass.print();
		System.out.println("xxxxxxxxxxxxxxxx");
		System.out.println(arrayclass.arrayfind("five"));
		
	}
}

