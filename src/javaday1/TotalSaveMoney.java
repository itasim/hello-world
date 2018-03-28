package javaday1;

import java.util.Scanner;

public class TotalSaveMoney {

	public static void main(String[] args) {

		int totalMoneyManwon;
		int salary;
		Scanner inputSalary = new Scanner(System.in);
		
		
		System.out.print("������ �Է��Ͻÿ� : ");
		salary = inputSalary.nextInt();
		
		totalMoneyManwon = (salary * 12) * 10;
		
		System.out.println("10�⵿���� ����� : " + totalMoneyManwon);
		
		inputSalary.close();
	}

}
