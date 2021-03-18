package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {		
		int a;
		Scanner scanner = new Scanner(System.in);
		String s1;

		System.out.println("달을 입력하세요");
		//s1 = scanner.next();

		//a = Integer.parseInt(s1);
		
		a = scanner.nextInt();
		if(a == 1 || a == 3 || a== 5 || a== 7 || a==8 || a==10 ||a == 12)
			System.out.printf("%d 월은 31일 입니다", a);
		else if(a == 2)
			System.out.printf("%d 월은 28일 입니다", a);
		else
			System.out.printf("%d 월은 30일 입니다", a);
		scanner.close();
	}

}
