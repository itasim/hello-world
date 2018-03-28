package javaday2;

// �н��� �ϱ� ���� �ۼ��ϴ°�. ���α׷��� �ǹ̾���. 
// �ڵ� �������� �� ���Ѽ� ���ϼ��ְ� �� ���� ������ �����ϱ� ���� �ڵ带 �ۼ��Ѵ�.

class Calculator {
	static double PI = 3.14;
	static int base = 30;
	
	int left;
	int right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right + base);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}


public class Hello {
	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOprands(10,  20);
		c1.sum();
		System.out.println(Calculator.PI);
		
		Calculator c2 = new Calculator();
		c2.setOprands(20,  40);
		System.out.println(Calculator.PI);
		
		System.out.println(Calculator.PI);


	}

}
