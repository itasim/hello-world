package javaday2;

public class MyClass {
	public void method1() {
		System.out.println("메소드 매개변수가 없어요");
	}
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행");
	}
	
	public int method3() {
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + y + "method4");
	}
	
	public int method5(int y) {
		y = y + 20;
		return y;
	}
	
}
