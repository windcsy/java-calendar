package calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public int getMaxDaysOfMonth(int month) {
		
		return MAX_DAYS[month-1];
	}

	public static void main(String[] args) {		
		int a;
		Scanner scanner = new Scanner(System.in);
		String s1;
		Calendar cal = new Calendar();
		System.out.println("달을 입력하세요");
		//s1 = scanner.next();

		//a = Integer.parseInt(s1);
		
		a = scanner.nextInt();
		System.out.printf("%d 월은 %d 일 입니다",a,cal.getMaxDaysOfMonth(a));
		//if(a == 1 || a == 3 || a== 5 || a== 7 || a==8 || a==10 ||a == 12)
	//		System.out.printf("%d 월은 31일 입니다", a);
		//else if(a == 2)
		//	System.out.printf("%d 월은 28일 입니다", a);
		//else
		//	System.out.printf("%d 월은 30일 입니다", a);
		scanner.close();
	}
}
