package javaday2;

import java.util.Scanner;

public class TotalSaveMoney {

	public static void main(String[] args) {

		int totalMoneyManwon;
		int salary;
		Scanner inputSalary = new Scanner(System.in);
		
		
		System.out.print("월급을 입력하시오 : ");
		salary = inputSalary.nextInt();
		
		totalMoneyManwon = (salary * 12) * 10;
		
		System.out.println("10년 후 저축액은 : " + totalMoneyManwon);
		
		inputSalary.close();
	}

}
