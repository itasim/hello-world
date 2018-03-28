package javaday3;

import java.util.Scanner;

public class CityLabel {

	public static void main(String[] args) {
		boolean isMetro;
		boolean isCapital;

		int Citizens;
		int riches;

		Scanner sc = new Scanner(System.in);

		System.out.print("수도입니까?(수도 : 1 수도아님: 0) ");
		isCapital = (sc.nextInt() == 1) ? true : false;

		System.out.print("인구(단위 : 백만) ");
		Citizens = sc.nextInt();

		System.out.print("부자의 수(단위: 백만) ");
		riches = sc.nextInt();

		isMetro = (isCapital == true && Citizens >= 100) || riches >= 50;

		System.out.println("메트로폴리스 여부 : " + isMetro);

		sc.close();

	}

}
