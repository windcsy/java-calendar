package calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMT ="cal> ";
	
	public void runPromt()
	{
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
			
			//System.out.printf("%d 월은 %d 일 입니다\r\n", a, cal.getMaxDaysOfMonth(a));
			cal.printCalendar(2021,a);
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
