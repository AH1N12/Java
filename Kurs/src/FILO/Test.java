package FILO;

public class Test {

	public static void main(String[] args) {
		FILO<Integer> filo = new FILO<Integer>();
		filo.add(1);
		filo.add(2);
		filo.add(3);
		filo.add(4);
		
		System.out.println(filo.GetELement());
		System.out.println(filo.GetELement());
		System.out.println(filo.GetELement());
		System.out.println(filo.GetELement());
		System.out.println(filo.GetELement());

	}

}
