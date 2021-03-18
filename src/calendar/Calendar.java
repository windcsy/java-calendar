package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		//System.out.println(" 한글 잘 나오나 테스트");
		//System.out.println("Hello, Calendar");
		
		// 입력 : 키보드로 두 수의 입력을 받는다.
				// 출력 : 화면에 두 수의 합을 출력한다.
				int a, b;
				Scanner scanner = new Scanner(System.in);
				String s1, s2;
				
				System.out.println("두 수를 입력하세요");
				s1 = scanner.next();
				s2 = scanner.next();
				
				
				
				a = Integer.parseInt(s1);
				b = Integer.parseInt(s2);
				
				int c = a + b;
				System.out.println(a + ", " + b);
				//System.out.println("두 수의 합은 "+ (a+b) + " 입니다");
				System.out.printf("두 수의 합은 %d 입니다", a+b);
				
				scanner.close();
	}

}
