package javaday1;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	// int <- byte
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue;	// int <- char
		System.out.println("가 : " + intValue);
		
		intValue = 200;
		double doubleValue = intValue;	// double <- int
		System.out.println(doubleValue);
	}

}
