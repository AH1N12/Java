package SortByName;

import java.util.Arrays;

public class Human implements Comparable<Human> {
	private String name, surname;
	private int age;

	public Human(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public Human(String allData) {
		String[] tmp = allData.split(" ");
		age = Integer.parseInt(tmp[2]);
		name = tmp[0];
		surname = tmp[1];
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Human hum) {
		if (age < hum.getAge())
			return -1;
		if (age > hum.getAge())
			return 1;
		if (surname.compareTo(hum.getSurname()) == -1)
			return -1;
		if (surname.compareTo(hum.getSurname()) == 1)
			return 1;
		if (name.compareTo(hum.getName()) == -1)
			return -1;
		if (name.compareTo(hum.getName()) == 1)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return name + " " + surname + " " + age;
	}

	public static void sort(Human[] table) {
		Arrays.sort(table);
	}
}
