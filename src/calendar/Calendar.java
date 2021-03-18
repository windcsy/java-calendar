package calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {

		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		int a, times;
		Scanner scanner = new Scanner(System.in);
		String s1;
		String PROMPT = "cal>";
		Calendar cal = new Calendar();
		
		while(true) 
		{			
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			a = scanner.nextInt();
			if(a == -1)break;
			
			System.out.printf("%d 월은 %d 일 입니다\r\n", a, cal.getMaxDaysOfMonth(a));
		}

		System.out.println("Have a nice day");
		scanner.close();
	}
}
