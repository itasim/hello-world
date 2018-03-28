package javaday2;

public class InnerExam {
	class Cal {
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	
	public static void main(String[] args) {
		InnerExam ie = new InnerExam();
		InnerExam.Cal cal = ie.new Cal();
		cal.plus();
		System.out.println(cal.value);
		
	}

}
