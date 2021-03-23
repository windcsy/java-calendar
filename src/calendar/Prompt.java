package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Prompt {	
	
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
	
	public void printMenu() {
		System.out.println("+---------------------------------+");
		System.out.println("| 1.  일정 등록");
		System.out.println("| 2.  일정 검색");
		System.out.println("| 3.  달력 보기");
		System.out.println("| h.  도움말 q. 종료");
		System.out.println("+---------------------------------+");
	}
	
	public void runPromt() throws ParseException
	{
		Scanner scanner = new Scanner(System.in);
		String cmd;
		Calendar cal = new Calendar();	
		
		printMenu();
		
		while(true) 
		{			
			
			cmd = scanner.next();
			
			if(cmd.equals("q")) {
				break;
			} else if(cmd.equals("1")) {
				
				cmdRegister(scanner, cal);
				
			} else if (cmd.equals("2")) {
				
				cmdSearch(scanner, cal);

			} else if (cmd.equals("3")) {
				
				showCalendar(scanner, cal);

			} else if (cmd.equals("h")) {
				
				printMenu();

			}
			
			System.out.println("CMD : 1, 2, 3, h, q");
			
		}

		System.out.println("Thank you. Good bye~");
		scanner.close();
	}
	
	
	private void showCalendar(Scanner scanner, Calendar cal) {
		int a, year=2017, weekday=0;
		
		System.out.println("연도를 입력하세요(exit:-1)");
		System.out.print("YEAR> ");
		year = scanner.nextInt();
		if(year == -1)return;
		
		System.out.println("달을 입력하세요");
		System.out.print("MONTH> ");
		a = scanner.nextInt();
		System.out.println("첫째날의 요일을 입력하세요.(su, mo, tu, wd, th, fr, sa)");
		String str_weekday = scanner.next();
		weekday = parseDay(str_weekday);
		
		
		cal.printCalendar(year,a, weekday);
		
	}

	private void cmdSearch(Scanner scanner, Calendar cal) throws ParseException {
		System.out.println("[일정 검색]");
		System.out.println("날짜를 입력해 주세요(yyyy-mm-dd)");		
		String date = scanner.next();
		
		String plan = cal.searchPlan(date);		
		System.out.println(plan);
	}

	private void cmdRegister(Scanner scanner, Calendar cal) throws ParseException {		
		System.out.println("[새 일정 등록]");		
		System.out.println("날짜를 입력해 주세요(yyyy-mm-dd)");
		String strDate = scanner.next();
		
		System.out.println("일정을 입력해 주세요");
		String plan = scanner.nextLine();
		plan = scanner.nextLine();
		System.out.println(plan);
		String plan2 = plan.replace("\n", "");
		
		cal.registerPlan(strDate, plan2);
		
	}

	public static void main(String[] args) throws ParseException {
		Prompt p = new Prompt();	
		
		p.runPromt();
	}
		
}
