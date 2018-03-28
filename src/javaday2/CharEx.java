package javaday2;

public class CharEx {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';

		int uniCode = c6;

		int z = 0 % 2;

		System.out.println(z);
		System.out.println("c1, c2, c3 = " + c1 + "," + c2 + "," + c3);
		System.out.println("c4, c5, c6 = " + c4 + "," + c5 + "," + c6);
		System.out.println("c1가-> " + uniCode);

	}

}
