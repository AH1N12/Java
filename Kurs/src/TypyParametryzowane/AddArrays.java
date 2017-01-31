package TypyParametryzowane;

public class AddArrays {
	
	static String[] ADD(String[] s1, String[] s2){
		int size= s1.length + s2.length;
		String[] table= new String[size];
		int i = 0;
		for (; i < s1.length; i++) {
			table[i]=s1[i];
		}
		System.out.println(i);
		for (; i < table.length; i++) {
			table[i]=s2[(i-s1.length)];
		}
		
		return table;
	}
	
	
	
	
	
	public static void main(String[] args) {
		String[] s1 = {"a","b"};
		String[] s2 = {"c","d"};
		String[] s3 = ADD(s1,s2);
		for (String string : s3) {
			System.out.println(string);
		}

	}

}
