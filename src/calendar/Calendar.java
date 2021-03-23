package calendar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.HashMap;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String SAVE_FILE="calendar.dat";
	private HashMap <Date, PlanItem>planMap; 
	
	public Calendar() {
		planMap = new HashMap<Date, PlanItem>();
		File f = new File(SAVE_FILE);
		if(f.exists())
		{
			try {
				//fr = new FileReader(f);
				Scanner sr = new Scanner(f);
				while(sr.hasNext()) {
					String line = sr.nextLine();
					String[] words = line.split(",");
					String detail = words[1].replace("\"", "");
					String strDate = words[0];
					
					
					PlanItem p = new PlanItem(strDate, detail);
					planMap.put(p.getDate(), p);
				}
				sr.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	/**
	 * 
	 * @param date ex:"2021-06-20"
	 * @param plan
	 * @throws ParseException 
	 */
	public void registerPlan(String strDate, String plan) throws ParseException {
		PlanItem p = new PlanItem(strDate, plan);		
		planMap.put(p.getDate(), p);
		
		String item = p.saveString();
		System.out.println(item);
		
		File f = new File(SAVE_FILE);
		try {
			FileWriter fw = new FileWriter(f,true);
			fw.write(item);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public PlanItem searchPlan(String strDate) throws ParseException {
		Date temp = PlanItem.getDatefromString(strDate);// SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		PlanItem plan = planMap.get(temp);
		return plan;
	}
	
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
