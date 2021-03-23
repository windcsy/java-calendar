package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PlanItem {
	public Date planDate;
	public String detail;
	public String people ="";
	
	public static Date getDatefromString(String strDate) {
		Date date=null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	public PlanItem(String strDate, String detail) {
		this.planDate = getDatefromString(strDate);
		this.detail = detail;
		
	}
	public void addPeople(String name) {
		this.people += name+",";
	}
	
	public Date getDate() {
		return planDate;
	}
}
