package javaday2;

public class BoxExam {

	public static void main(String[] args) {
//		Box box = new Box();
//		
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		
		
		Box<Object> box = new Box<>();
		box.setObj(new Object());;
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("aaaaa");
		
	}

}
