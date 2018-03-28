package javaday3;

public class AccuracyEx1 {

	public static void main(String[] args) {
		// 부동소수점은 2에 -1승, 2에 -2승, 2에 -3승, 2에 -4승으로 내려가는데 소수중에 2진수가 표현 못하는 수가 있다.
		// 0.1은 절대 2진수로 나타낼 수 없다.		
		// 각각 0.5, 0.25, 0.0125, 0.0625
		
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result = apple - (number * pieceUnit);
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + " 조각이 남는다.");

	}

}
