package javaday4;
import java.util.Scanner;

public class CafeOrderEx {

	public static void main(String[] args) {
		System.out.println("a.아메리카노 c.카푸치노 i.카페라떼 m.카페모카");
		System.out.print("어떤 메뉴를 주문하시겠어요?  ");

		Scanner sc = new Scanner(System.in);
		char order = sc.next().charAt(0);
		
		switch (order) {
		case 'a':
		case 'A':
			System.out.println("아메리카노 주문하셨습니다.");
			break;
		case 'c':
		case 'C':
			System.out.println("카푸치노 주문하셨습니다.");
			break;
		case 'l':
		case 'L':
			System.out.println("카페라떼 주문하셨습니다.");
			break;
		case 'm':
		case 'M':
			System.out.println("카페모카 주문하셨습니다.");
			break;
		default:
			System.out.println("없는 메뉴 입니다. 새로 주문해주세요~");
		}
		
		sc.close();
	}

}
