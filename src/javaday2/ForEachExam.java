package javaday2;

public class ForEachExam {

	public static void main(String[] args) {
		int[] iarr = { 10, 20, 30, 40, 50 };

		int value;
		for (int i = 0; i < iarr.length; i++) {
			value = iarr[i];
			System.out.println(value);
		}

		for (int value2 : iarr) {
			System.out.println(value2);
		}

	}

}
