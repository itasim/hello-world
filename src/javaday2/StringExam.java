package javaday2;

public class StringExam {

	public static void main(String args[]) {
		String str1 = "hello";
		String str2 = "hello";
//		str1과 str2는 hello라는 같은 인스턴트를 참조한다.
		
		String str3 = new String("hello");
		String str4 = new String("hello");
//		str3과 str4는 각각을 가르킨다. 그게 큰따옴표롤 하는것과 차이다
		
		System.out.println(str4.substring(0));
		
		
		
	}
	
}
