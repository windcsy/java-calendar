package calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public boolean isLeapYear(int year) {
		if((year % 4 == 0) && ((year % 100 != 0) ||  (year % 400 == 0)) )
			return true;
		else return false;
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year))
			return LEAP_MAX_DAYS[month-1];
		else return MAX_DAYS[month - 1];
	}
	
	public void printCalendar(int year, int month, int weekday) {
		System.out.printf(" << %4d년 %2d월 >>\n",year,month);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println(" --------------------");
		
		int max_day = getMaxDaysOfMonth(year,month);
		int w, j, days=1;
		for(w=0; w<weekday; w++)System.out.print("   ");
		
		for(j=1; j<=7-weekday; j++)System.out.printf("%3d",j);
		System.out.println();
		
		days=1;
		for(int i=j; i<=max_day; i++, days++) {
			
			System.out.printf("%3d",i);
			//if((i%7) == 0)System.out.println();
			if((days%7) == 0) { 
				System.out.println();
			}
		}
		System.out.println();
	}

	
}
