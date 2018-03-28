package javaday4;
import java.util.Scanner;

public class IsNumEquars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;

		System.out.print("첫번째 정수를 입력 하시오 : ");
		n1 = sc.nextInt();

		System.out.print("두번째 정수를 입력 하시오 : ");
		n2 = sc.nextInt();

		if (n1 == n2) {
			System.out.println("첫번째 정수 와 두번째 정수는 Same");
		} else {
			System.out.println("첫번째 정수 와 두번째 정수는 Different");
		}
		
		sc.close();
	}

}
