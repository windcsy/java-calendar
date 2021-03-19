package calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMT ="cal> ";
	/**
	 * 
	 * @param week 요일명
	 * @return 0~6(0 = 일요일, 6 = 토요일)
	 */
	public int parseDay(String week) {
		
		if(week.equals("su"))
			return 0;
		else if(week.equals("mo"))
			return 1;
		else if(week.equals("tu"))
			return 2;
		else if(week.equals("wd"))
			return 3;
		else if(week.equals("th"))
			return 4;
		else if(week.equals("fr"))
			return 5;
		else 
			return 6;
		
	}
	
	public void runPromt()
	{
		int a, times, year=2017, weekday=0;
		Scanner scanner = new Scanner(System.in);
		String s1;
		String PROMPT = "cal>";
		Calendar cal = new Calendar();
		
		while(true) 
		{			
			System.out.println("연도를 입력하세요");
			System.out.print(PROMPT);
			year = scanner.nextInt();
			
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			a = scanner.nextInt();
			System.out.println("첫째날의 요일을 입력하세요.(su, mo, tu, wd, th, fr, sa)");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if(a == -1)break;
			
			//System.out.printf("%d 월은 %d 일 입니다\r\n", a, cal.getMaxDaysOfMonth(a));
			cal.printCalendar(year,a, weekday);
			//System.out.printf("%d 월은 입니다\r\n", a, cal.printCalendar(2021,a));
		}

		System.out.println("Have a nice day");
		scanner.close();
	}
	
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		
		p.runPromt();
	}
		
}
