package javaday2;

public class Bus extends Car {
	
	public Bus() {
		super("abc",111);
	}
	
	public void run() {
		System.out.println(this.name + "달리다");
	}

}
