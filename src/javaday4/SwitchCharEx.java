package javaday4;

import java.util.Scanner;

public class SwitchCharEx {

	public static void main(String[] args) {
		System.out.print("회원님의 등급을 영문으로 입력해 주세요 : ");
		Scanner scan = new Scanner(System.in);
		char grade = scan.next().charAt(0);

		switch (grade) {
		case 'a':
		case 'A':
			System.out.println("우수회원입니다");
			break;
		case 'b':
		case 'B':
			System.out.println("일반회원입니다");
			break;
		default:
			System.out.println("손님입니다.");
		}
		
		scan.close();
		
	}

}
