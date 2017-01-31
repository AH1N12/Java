package TypyParametryzowane;

public class Test {
	public static void main(String[] args) {
		String[] s1 = {"a","b"};
		String[] s2 = {"c","d"};
		ArrayAdder<String> ad =new ArrayAdder<String>();
		String[] s3 = ad.ADD(s1, s2);
		for (String string : s3) {
			System.out.println(string);
		}

	}
}
