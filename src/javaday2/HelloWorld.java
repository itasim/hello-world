package javaday2;

public class HelloWorld {

	public static void main(String[] args) {
//		int[] array1 = {1, 2, 3, 4, 5};
//		int[][] array2 = {{1, 2, 3}, {2, 3, 4}, {5, 6, 7}};
		int[][] array3 = new int[10][];
		
		try {
			array3[0] = new int[10];
			array3[0][9] = 123456;
		} catch (NullPointerException e) {
			System.out.println("null 포인터 예외");
		}
		
		System.out.println(array3[0][9]);
		
	}

}
