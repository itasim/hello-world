package gugudan;

public class Gugu {
	public static void CalcAndPrint(int times) {
		for (int i = 1; i < 10; i++) {
			System.out.print(times + " * " + i + " = " + (times * i) + " " );
		}
		System.out.println();
	}

	public static void main(String[] args) {
		for (int di = 2; di < 10; di++) {
			CalcAndPrint(di);
		}
	}

}
