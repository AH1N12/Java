package SortByName;

public class Run {

	public static void main(String[] args) {
		Human[] humans = {new Human( "jacek","pklacek",12), new Human("jacek placek 12"), new Human("ola monola 32"), new Human("kasia grubasia 23"),new Human("kasia grubasia 23")};
		for (Human human : humans) {
			System.out.println(human.toString());
		}
		Human.sort(humans);
		for (Human human : humans) {
			System.out.println(human.toString());
		}
	}

}
//Zaproponowa� spos�b na sortowanie sekwencji
//"Imi� Nazwisko Wiek" z uwzgl�dnieniem wieku, nazwiska, imienia
//String.split(" ");