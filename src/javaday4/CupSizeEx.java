package javaday4;

import java.util.Scanner;

public class CupSizeEx {

	public static void main(String[] args) {
		int cupSizeml = 0;
		String strSize = "";
		Scanner sc = new Scanner(System.in);

		sc.next().charAt(0);
		
		System.out.print("컵 사이즈는 얼마인가요?(단위 ml) : ");
		cupSizeml = sc.nextInt();

		if (cupSizeml < 100) {
			strSize = "small";
		} else if (cupSizeml < 200) {
			strSize = "medium";
		} else {
			strSize = "large";
		}

		System.out.println("컵은 : " + strSize);
		
		sc.close();
	}

}
