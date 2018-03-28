package javaday4;

import java.util.Scanner;

public class isOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("홀수 짝수를 판별할 정수를 입력 하시오 : ");
		num = sc.nextInt();
		
		System.out.println();
		
		if (num % 2 == 0) {
			System.out.println("입력한 정수는 짝수입니다");
		} else {
			System.out.println("입력한 정수는 홀수입니다");
		}
		
		sc.close();
	}

}
