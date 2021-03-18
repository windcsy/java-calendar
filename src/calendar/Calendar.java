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
		Calendar cal = new Calendar();

		System.out.println("횟수를 입력하세요");
		times = scanner.nextInt();

		for (int i = 0; i < times; i++) {
			System.out.println("달을 입력하세요");
			a = scanner.nextInt();

			System.out.printf("%d 월은 %d 일 입니다\n", a, cal.getMaxDaysOfMonth(a));
		}

		System.out.println("bye");
		scanner.close();
	}
}
