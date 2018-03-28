package javaday2;

public class StringExam2 {
	// 스트링 클래스 문제점 파악
	public static void main(String[] args) {
		String str1 = "hello world";
		String str2 = str1.substring(5);

		System.out.println(str1);
		System.out.println(str2);

		String str3 = str1 + str2;
		System.out.println(str3);

		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);

		// 한번 돌때마다 StringBuffer 객체가 생성 총 100번 객체 생성됨.
		// 문제는 이렇게 하면 속도가 느려진다는것이다.
		String str5 = "";
		for (int i = 0; i < 100; i++) {
			str5 = str5 + "*";
		}
		System.out.println(str5);

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			sb.append("*");
		}
		String str6 = sb.toString();
		System.out.println(str6);
		

	}
}
