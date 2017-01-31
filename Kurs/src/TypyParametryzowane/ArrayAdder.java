package TypyParametryzowane;

public class ArrayAdder<T> {
	public T[] ADD(T[] s1, T[] s2) {
		int size = s1.length + s2.length;
		T[] table =  (T[]) new Object[size];
		int i = 0;
		for (; i < s1.length; i++) {
			table[i] = s1[i];
		}
		System.out.println(i);
		for (; i < table.length; i++) {
			table[i] = s2[(i - s1.length)];
		}

		return table;
	}

}
