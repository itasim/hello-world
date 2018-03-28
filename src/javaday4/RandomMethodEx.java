package javaday4;

public class RandomMethodEx {

	public static void main(String[] args) {
		int randomValue = (int) (Math.random() * 10);
		double randomDoubleValue = Math.random() * 10;
		float randomFloatValue = (float) (Math.random() * 10);
		double tenPlus = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tenPlus += 0.1;
		}
		
		
		System.out.println(tenPlus);
		
		
		
		
		System.out.println(randomValue);
		System.out.println(randomDoubleValue);
		System.out.println(randomFloatValue);
	}

}
