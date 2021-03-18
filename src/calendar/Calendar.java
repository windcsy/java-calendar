package calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {

		return MAX_DAYS[month - 1];
	}
	
	public void printCalendar(int year, int month) {
		System.out.printf(" << %4d년 %2d월 >>\n",year,month);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println(" --------------------");
		int max_day = getMaxDaysOfMonth(month);
		
		for(int i=1; i<=max_day; i++) {
			System.out.printf("%3d",i);
			if((i%7) == 0)System.out.println();
		}
		System.out.println();
	}

	
}
